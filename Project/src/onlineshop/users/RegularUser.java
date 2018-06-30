package onlineshop.users;

import onlineshop.order.Order;
import onlineshop.shipping.ShippingType;

public class RegularUser extends User {
    private Order userOrder;
    private ShippingType shippingType;

    public RegularUser(String userName, String address, String phone) {
        super(userName, address, phone);
        userOrder = new Order(shippingType);
    }

    @Override
    public void giveOrder() {

    }

    public void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }
}
