package by.issoft.files;

import java.util.*;

public class User {
    public String username;
    public String profession;
    public double age;
    public List<User> colleagues;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", profession='" + profession + '\'' +
                ", age=" + age +
                '}';
    }
}
