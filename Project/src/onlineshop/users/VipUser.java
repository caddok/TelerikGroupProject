package onlineshop.users;

import onlineshop.order.Order;
import onlineshop.product.Product;

public class VipUser extends User {
    private Order userOrder;
    private VipUserType type;

    protected VipUser(String userName, String address, String phone, String password) {
        super(userName, address, phone, password);
        userOrder = new Order();
        setType(type);
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
        switch (type) {
            case SILVER:
                totalCost -= totalCost * 0.05;
                break;
            case GOLD:
                totalCost -= totalCost * 0.1;
                break;
            case PLATINUM:
                totalCost -= totalCost * 0.15;
                break;
        }
        return totalCost;
    }

    public VipUserType getType() {
        return type;
    }

    private void setType(VipUserType type) {
        this.type = type;
    }
}