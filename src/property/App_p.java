package property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2017/6/21.
 */
public class App_p {

    //容器对象
    private ApplicationContext ac = new ClassPathXmlApplicationContext("property/bean_p.xml");

    @Test
    public void test() {
        //从容器获取
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testAction() {
        //从容器获取Action
        UserAction userAction = (UserAction) ac.getBean("userAction");
        userAction.execute();
        System.out.println(ac.getBean("user"));
    }
}
