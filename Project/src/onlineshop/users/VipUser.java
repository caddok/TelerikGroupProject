package onlineshop.users;

public class VipUser extends User {

    protected VipUser(String userName, String address, String phone) {
        super(userName, address, phone);
    }

    @Override
    public void giveOrder() {

    }
}
