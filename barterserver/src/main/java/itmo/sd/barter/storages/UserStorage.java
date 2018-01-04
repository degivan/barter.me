package itmo.sd.barter.storages;

import itmo.sd.barter.data.UserInfo;

public interface UserStorage extends Storage<UserInfo> {

    boolean isRegistered(UserInfo userInfo);

    UserInfo lookupUser(UserInfo userInfo);
}
