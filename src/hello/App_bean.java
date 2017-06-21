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
public class App_bean {


    //得到ioc容器对象
    private ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("hello/applicationContext.xml");

    /**
     * 1) 对象创建：单例/多例
     * scope="singleton", 默认值，默认是单例 （service/dao/工具类）
     * scope="prototype", 多例 （Action对象）
     *
     * 2）什么时候创建
     * scope="prototype", 在用到对象的时候，才创建对象
     * scope="singleton", 再启动（容器初始化之前，就已经创建了bean,且整个应用只有一个）
     *
     * 3) 是否延迟创建
     * lazy-init="true"， 默认为false，不延迟创建，即在启动的时候就创建对象
     * lazy-init="false"，延迟初始化，在用到对象的时候才创建对象
     * （只对单例有效）
     *
     * 4) 创建对象之后  初始化/销毁
     * init-method="init_user"
     * destroy-method="destroy_user"
     */
    @Test
    public void test1() {
        //从容器中获取Bean
        User user1 = (User) ac.getBean("user");
        User user2 = (User) ac.getBean("user");
        System.out.println(user1);
        System.out.println(user2);
        //容器销毁对象
        ac.destroy();
    }
}
