package itmo.sd.barter.storages;

import com.google.common.collect.Iterables;
import itmo.sd.barter.data.UserInfo;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertTrue;

public class UserStorageTest {
    @Test
    public void testFindAll_empty_returnsEmptyList() throws SQLException {
        UserStorage userStorage = new UserSqlStorage();
        Iterable<UserInfo> res = userStorage.findAll();
        assertTrue(Iterables.size(res) == 0);
    }
}
