import indi.ssm.bean.User;
import indi.ssm.service.UserService;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//不使用 Spring 时，一般情况下的一种测试方法 ；
/**
 * 这个测试类在此项目中可能不能用，主要是用来记录，单个文件测试的的格式
 *
 */
public class TestMyBatis1 {
	
	private ApplicationContext ac = null;
	private UserService userService = null;
	
	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		userService = (UserService) ac.getBean("userService");
	}

	@Test
	public void testUser() {
		List<User> list = userService.selectUser();
		for (User user : list) {
			System.out.println(user.getUuid()+":"+user.getUserName());
		}
	}
	@Test
	public void selectTableTest() {
		List<User> list = userService.selectTest("t_sys_user");
		for (User user : list) {
			System.out.println(user.getUuid()+":"+user.getUserName());
		}
	}
}
