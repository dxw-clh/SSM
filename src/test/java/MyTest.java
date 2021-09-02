import com.dxw.pojo.User;
import com.dxw.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) context.getBean("userServiceImpl");

        for (User user : userService.getUserList()) {
            System.out.println(user);
        }
    }
}
