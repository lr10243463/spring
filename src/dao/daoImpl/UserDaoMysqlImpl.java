package dao.daoImpl;

import dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("mysql-save");
		
	}

	@Override
	public void delete() {
		System.out.println("mysql-delete");
	}

}
