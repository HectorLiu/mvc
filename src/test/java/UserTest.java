import com.hector.mappers.UserMapper;
import com.hector.models.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void allUser(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
