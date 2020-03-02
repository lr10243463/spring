package test;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;
import dao.daoImpl.UserDaoMysqlImpl;

public class UserTest {
	

	@Test
	public void test() {
		
//		1.加载配置文件
		ClassPathXmlApplicationContext applicationContext =
		 new ClassPathXmlApplicationContext("springContext.xml");
		
		
//		2.根据id获取对象
		
		UserDao UserDao = (UserDao)applicationContext.getBean("userDao");
		
		UserDao.save();
		UserDao.delete();
	}
	
}
