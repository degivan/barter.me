package itmo.sd.barter.services;

import itmo.sd.barter.data.UserInfo;
import itmo.sd.barter.exceptions.UserNotRegisteredException;
import itmo.sd.barter.storages.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserStorage userStorage;

    public UserInfo registerUser(UserInfo userInfo) {
        if(!userStorage.isRegistered(userInfo)) {
            return userStorage.create(userInfo);
        }
        return null;
    }

    public UserInfo loginUser(UserInfo userInfo) throws UserNotRegisteredException {
        if(!userStorage.isRegistered(userInfo)) {
            throw new UserNotRegisteredException(userInfo);
        }
        return userStorage.lookupUser(userInfo);
    }
}
