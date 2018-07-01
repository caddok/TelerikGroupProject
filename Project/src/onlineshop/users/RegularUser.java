package onlineshop.users;

import onlineshop.order.Order;
import onlineshop.product.Product;

public class RegularUser extends User {
    private Order userOrder;

    public RegularUser(String userName, String address, String phone,
                       String password) {
        super(userName,address,phone,password);
        userOrder = new Order();
    }

    public Order getUserOrder() {
        return userOrder;
    }
    @Override
    public double calcTotalCost() {
        double totalCost = userOrder.getSelected().stream().mapToDouble(Product::getPrice).sum();
        switch (userOrder.getShipping()) {
            case EXPRESS:
                totalCost += totalCost * 0.3;
                break;
            case STANDART:
                totalCost += totalCost * 0.1;
                break;
        }
        return totalCost;
    }
}
