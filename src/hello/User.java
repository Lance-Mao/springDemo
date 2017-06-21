package hello;

/**
 * Created by admin on 2017/6/20.
 */
public class User {
    private int id;
    private String name;

    public User() {
        super();
        System.out.println("User对象已经创建");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init_user() {
        System.out.println("创建对象之后初始化！");
    }

    public void destroy_user() {
        System.out.println("Ioc容器销毁，user对象回收！");
    }
}
