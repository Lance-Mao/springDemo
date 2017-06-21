package anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017/6/21.
 */
//把当前对象加入ioc容器
//@Component
//@Repository    //在持久层可以选择用此注解
public class UserDao {

    public void save() {
        System.out.println("DB:保存了用户");
    }
}
