package example.dao;

import example.pojo.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/*
@Component
public class MembersDao {

    private static final String SQL_QUERY = "select * from t_user";
    @Autowired
    DataSource dataSource;
    public Members findByName(String username) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Members members = null;
        try{
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement(SQL_QUERY);
            rs = stmt.executeQuery();
            int i = 0;
            if(rs.next()){
                i++;
                System.out.println(i);
                members.setUserName(rs.getString("username"));
                members.setPassword(rs.getString("password"));
            }
            return members;
        }catch (Exception e){

        }
        return members;
    }*/
public interface  MembersDao{
    public Members getUser(String username);
    public int saveUser(Members m);
    public int updateUser(Members m);
}