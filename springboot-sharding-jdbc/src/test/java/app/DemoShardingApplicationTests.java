package app;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.fencer911.dao.UserDAO;
import cn.fencer911.entity.User;



@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoShardingApplicationTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testInsert() {
        System.out.println(("----- sharding insert method test ------"));
        for (int i = 0; i < 100; i++) {
            User userData = new User();
            userData.setUid(new Random().nextInt(999999));
            userData.setName(UUID.randomUUID().toString().replaceAll("-", ""));
            userData.setCreditId("1234567890");
            userData.setMobile("1234567890");
            userData.setCreateTime(new Date());
            userDAO.insert(userData);
        }
    }
}
