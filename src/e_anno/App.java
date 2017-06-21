package e_anno;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private ApplicationContext ac =
		new ClassPathXmlApplicationContext("e_anno/bean.xml");

	@Test
	public void testExecuteAction() {
		UserAction userAction = (UserAction) ac.getBean("userAction");
		userAction.execute();
	}
}





