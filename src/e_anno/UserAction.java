package e_anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class UserAction {

	@Resource
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	

	public String execute() {
		userService.save();
		return null;
	}
}








