package Io;

import java.io.Serializable;

public class UserInfo implements Serializable {
    String name, password;
    int age;

    public UserInfo() {
        this("unknown","1111",0);
    }

    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "("+name+","+password+","+age+")";
    }
}
