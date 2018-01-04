package itmo.sd.barter.services;

import itmo.sd.barter.data.UserInfo;
import itmo.sd.barter.exceptions.UserNotRegisteredException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /**
     * Register user.
     * @param userInfo information about user to register
     * @return if user did not register already, return new user with filled uid; otherwise, return null.
     */
    UserInfo registerUser(UserInfo userInfo);

    /**
     * Login user.
     * @param userInfo information about user to login
     * @return info about user
     * @throws UserNotRegisteredException in case user did not registered yet
     */
    UserInfo loginUser(UserInfo userInfo) throws UserNotRegisteredException;
}
