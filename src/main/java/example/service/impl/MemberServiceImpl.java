package example.service.impl;

import example.dao.MembersDao;
import example.pojo.Members;
import example.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service
public class MemberServiceImpl implements MembersService {
    @Autowired
    MembersDao membersDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails result = null;
       //根据用户名获取对象

        //Members members = membersDao.findByName(username);
        Members members = membersDao.getUser(username);
        if (members != null) {
        //创建角色集合对象
            Collection<GrantedAuthority> authorities = new ArrayList<>();

            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_USER");
            authorities.add(grantedAuthority);
            User user = new User(members.getUserName(), members.getPassword(), authorities);
            result = user;
        }
        return result;
    }

    /**
     * 获取用户的角色权限,为了降低实验的难度，这里去掉了根据用户名获取角色的步骤
     * @param
     * @return
     */
    private Collection<GrantedAuthority> getAuthorities(){
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
        authList.add(new SimpleGrantedAuthority("ROLE_USER"));
        return authList;
    }

}