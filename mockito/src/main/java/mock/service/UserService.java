package mock.service;

import mock.dao.UserDao;
import mock.domain.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserService{
//    @Resource
    private UserDao userDao;

    public String getUserName(String userId)
    {
        User user = userDao.select(userId);

        if (null == user)
        {
            return "";
        }else {
            return "offline_" + user.getName();
        }
    }
}
