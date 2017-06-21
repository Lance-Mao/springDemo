package create_obj;

/**
 * 工厂 创建对象
 * Created by admin on 2017/6/20.
 */
public class ObjectFactory {

    //实例方法创建对象  先创建对象
    public User getInstance() {
        return new User(100, "调用实例方法");
    }

    //实例方法创建对象  直接调用
    public static User getStaticInstance() {
        return new User(101, "调用静态方法");
    }
}
