package anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by admin on 2017/6/21.
 */
//@Component("userService")
//@Component
@Service  //业务逻辑层的组件
public class UserService {

    //会从ioc容器中找userDao对象，注入到当前字段
    @Resource
    private UserDao userDao; //= new UserDao();  根据这个名称去ioc容器中找，找到后就赋值

    //IOC 对象的创建交给spring的外部容器完成
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
