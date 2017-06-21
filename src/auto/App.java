package auto;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import property.User;

/**
 * Created by admin on 2017/6/21.
 */
public class App {

    //容器对象
    private ApplicationContext ac = new ClassPathXmlApplicationContext("auto/bean.xml");

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
    }
}
