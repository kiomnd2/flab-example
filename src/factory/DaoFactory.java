package factory;

import dao.UserDao;
import maker.DConnectionMaker;

public class DaoFactory {

    public static UserDao createUserDao() {
        return new UserDao(new DConnectionMaker());
    }
}
