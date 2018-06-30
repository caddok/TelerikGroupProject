package onlineshop.order;
import onlineshop.product.Product;
import onlineshop.shipping.ShippingType;
import onlineshop.users.User;

import java.util.ArrayList;

import onlineshop.shipping.ShippingType;
import onlineshop.users.User;

import java.util.ArrayList;

public class Order {
    private int totalCost;
    private ArrayList<User> userOrders;
    private ShippingType shippingType;

    public Order(ShippingType shippingType) {
        userOrders = new ArrayList<>();
        this.shippingType = shippingType;
    }
}
