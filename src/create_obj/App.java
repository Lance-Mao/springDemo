package create_obj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2017/6/20.
 */
public class App {

    @Test
    public void test() {
         //创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("auto/bean.xml");
        //获取容器中的对象
         User user = (User) ac.getBean("user");
    }
}
