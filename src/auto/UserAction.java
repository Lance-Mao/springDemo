package auto;

/**
 * Created by admin on 2017/6/21.
 */
public class UserAction {

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
