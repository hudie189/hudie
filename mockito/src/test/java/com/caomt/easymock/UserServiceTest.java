package com.caomt.easymock;

import mock.AppConfig;
import mock.dao.UserDao;
import mock.domain.User;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import mock.service.UserService;

import javax.annotation.Resource;
import java.lang.reflect.Field;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest{

    private UserDao userDaoMock = null;

    private User userMock = null;

    @Resource
    private UserService userService;

    @Before
    public void setUp() throws NoSuchFieldException, IllegalAccessException {
        // 创建mock对象
        userDaoMock = EasyMock.createMock(UserDao.class);
        userMock = EasyMock.createMock(User.class);

        // mock对象注入被测对象
        Field userDaoField = userService.getClass().getDeclaredField("userDao");
        userDaoField.setAccessible(true);
        userDaoField.set(userService,userDaoMock);
    }


    @Test
    public void getUserName()
    {
        // 设置mock对象的期望值
        EasyMock.expect(userMock.getName()).andReturn("testName");
        EasyMock.expect(userDaoMock.select("1")).andReturn(userMock);

        // mock对象的replay
        EasyMock.replay(userMock);
        EasyMock.replay(userDaoMock);

        // 断言
        Assert.assertTrue(userService.getUserName("1").equals("offline_testName"));

        // 验证mock对象是否被调用
        EasyMock.verify(userMock);
        EasyMock.verify(userDaoMock);
    }

    @After
    public void tearDown() throws Exception {
        userDaoMock = null;
        userMock = null;
    }
}
