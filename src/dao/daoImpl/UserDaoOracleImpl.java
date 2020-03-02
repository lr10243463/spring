package dao.daoImpl;

import dao.UserDao;

public class UserDaoOracleImpl implements UserDao{

	@Override
	public void save() {
		System.out.println("oracle-save");
		
	}

	@Override
	public void delete() {
		System.out.println("oracle-delete");
		
	}

}
