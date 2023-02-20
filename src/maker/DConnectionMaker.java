package maker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("test111");
    }
}
