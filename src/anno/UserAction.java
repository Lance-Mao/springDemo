package anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by admin on 2017/6/21.
 */
//@Component  //加入ioc容器
    @Controller     //控制层的组件
public class UserAction {

    @Resource(name = "userService")       //根据名称查找
//    @Resource                               //根据类型查找（在容器中要确保该类只有一个变量）
    //service: springIoC容器注入
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
     public String execute() {
         userService.save();
         return null;
     }
}
