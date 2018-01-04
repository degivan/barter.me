package itmo.sd.barter.exceptions;

import itmo.sd.barter.data.UserInfo;

public class UserNotRegisteredException extends Exception {
    public UserNotRegisteredException(UserInfo userInfo) {
        super(userInfo.toString());
    }
}
