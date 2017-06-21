package e_anno;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserDao {
	public void save() {
		System.out.println("DB:执行了操作");
	}
}
