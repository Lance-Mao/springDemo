package hello;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by admin on 2017/6/20.
 */
public class App_get {

    //通过工厂类得到ioc容器创建的对象
    @Test
    public void test() {
        //创建对象
//        User user = new User();
        //现在把对象的床架交给spring的ioc容器
        Resource resource = new ClassPathResource("hello/applicationContext.xml");
        //创建容器对象（Bean）的工厂
        BeanFactory factory = new XmlBeanFactory(resource);
        //得到容器创建的对象
        User user = (User) factory.getBean("user");
        System.out.println(user.getId());
    }

    //直接得到ioc容器对象
    @Test
    public void test1() {
        //得到ioc容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("hello/applicationContext.xml");
        //从容器中获取Bean
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }
}
