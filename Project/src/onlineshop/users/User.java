package onlineshop.users;

public abstract class User  {
    private String userName;
    private String password;
    private String phone;
    private String address;

    protected User(String userName, String address, String phone,
                   String password) {
        super();
        setPassword(password);
        setUserName(userName);
        setPhone(phone);
        setAddress(address);
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public abstract double calcTotalCost();

}