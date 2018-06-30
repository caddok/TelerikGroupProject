package onlineshop.users;

public abstract class User extends Cart {
    private String userName;
    private String phone;
    private String address;

    protected User(String userName, String address, String phone) {
        super();
        setUserName(userName);
        setPhone(phone);
        setAddress(address);
    }

    public abstract void giveOrder();

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private void setAddress(String address) {
        this.address = address;
    }
}
