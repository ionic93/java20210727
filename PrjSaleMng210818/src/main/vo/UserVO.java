package vo;

import java.util.Date;

public class UserVO {
    private int userId;
    private String userName;
    private String password;
    private Date createOn;
    private int quota;
    private String products;
    private Date expiresOn;
    private String adminUser;
    private String id;

    //모든 정보를 들고 와서 담을 때
    public UserVO(int userId, String userName, String password, Date createOn,
                  int quota, String products, Date expiresOn, String adminUser, String id) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.createOn = createOn;
        this.quota = quota;
        this.products = products;
        this.expiresOn = expiresOn;
        this.adminUser = adminUser;
        this.id = id;
    }
    //demo_users에 insert할 때 사용
    public UserVO(String userName, String password, String id) {
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

}
