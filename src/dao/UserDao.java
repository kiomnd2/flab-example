package dao;

import maker.ConnectionMaker;
import domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    private final ConnectionMaker connectionMaker;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void add(User user) throws SQLException {
        try (Connection connection = connectionMaker.getConnection();
                PreparedStatement ps = connection.prepareStatement("select * from User")) {
            ps.setString(1, user.getUserId());
            ps.setString(2, user.getUserName());
            ps.setString(3, user.getPassword());
            ps.executeUpdate();
        }
    }

    public User getUser(String userId) {
        return new User(userId, "userName", "qwer1234");
    }
}
