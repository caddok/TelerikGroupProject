package onlineshop.users;

<<<<<<< HEAD
=======
<<<<<<< HEAD
import onlineshop.users.Cart;
=======
>>>>>>> db72fcb445bd2aca4639e158dfb83f18ba2e8b82

>>>>>>> nmateev-master
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
<<<<<<< HEAD

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private void setAddress(String address) {
        this.address = address;
    }
=======
<<<<<<< HEAD
>>>>>>> nmateev-master
}
=======
}
>>>>>>> db72fcb445bd2aca4639e158dfb83f18ba2e8b82
