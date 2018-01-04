package itmo.sd.barter.data;

import org.jooq.util.maven.example.tables.records.UsersRecord;

public class UserInfo {
    private String uid;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String city;

    public UserInfo() {
    }

    public UserInfo(String firstName, String lastName, String email, String phone, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static UserInfo from(UsersRecord usersRecord) {
        UserInfo userInfo = new UserInfo();

        userInfo.setUid(usersRecord.getId().toString());
        userInfo.setCity(usersRecord.getCity());
        userInfo.setFirstName(usersRecord.getFirstName());
        userInfo.setLastName(usersRecord.getLastName());
        userInfo.setEmail(usersRecord.getEmail());
        userInfo.setPhone(usersRecord.getPhone());

        return userInfo;
    }
}
