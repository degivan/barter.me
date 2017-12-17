package itmo.sd.barter.services;

import itmo.sd.barter.data.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserInfo registerUser(UserInfo userInfo);

    UserInfo loginUser(UserInfo userInfo);
}
