package itmo.sd.barter.services;

import itmo.sd.barter.data.UserInfo;
import itmo.sd.barter.storages.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserStorage userStorage;

    public UserInfo registerUser(UserInfo userInfo) {
        return null;
    }

    public UserInfo loginUser(UserInfo userInfo) {
        return null;
    }
}
