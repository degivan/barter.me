package itmo.sd.barter.storages;

import itmo.sd.barter.data.UserInfo;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.util.maven.example.tables.Users;
import org.jooq.util.maven.example.tables.records.UsersRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.stream.Collectors;

public class UserSqlStorage implements UserStorage {
    private Connection conn = DriverManager.getConnection("jdbc:postgresql:barter", "barter", "barter");
    private DSLContext dslContext = DSL.using(conn, SQLDialect.POSTGRES);

    public UserSqlStorage() throws SQLException {
    }

    public UserInfo create(UserInfo value) {
        return null;
    }

    public UserInfo update(UserInfo value) {
        return null;
    }

    public UserInfo delete(UserInfo value) {
        return null;
    }

    public Iterable<UserInfo> findAll() {
        Result<Record> res = dslContext.select().from(Users.USERS).fetch();
        return res.into(UsersRecord.class)
                .stream()
                .map(UserInfo::from)
                .collect(Collectors.toList());
    }

    public boolean isRegistered(UserInfo userInfo) {
        return false;
    }

    public UserInfo lookupUser(UserInfo userInfo) {
        return null;
    }
}
