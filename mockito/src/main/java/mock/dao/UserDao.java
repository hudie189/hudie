package mock.dao;

import mock.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public User select(String id) {
        return new User();
    }
}
