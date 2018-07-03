package onlineshop.order;

import onlineshop.product.Product;
import onlineshop.shipping.ShippingType;
import onlineshop.users.Cart;

import java.util.ArrayList;

public class Order implements Cart {
    private ArrayList<Product> selected;
    private ShippingType shipping;
    public Order() {
        selected = new ArrayList<>();
    }

    private void setSelected(ArrayList<Product> selected) {
        this.selected = selected;
    }
    public ArrayList<Product> getSelected() {
        return new ArrayList<>(selected);
    }
    @Override
    public void giveOrder() {
        System.out.println("Your order have been successfully send");
    }

    @Override
    public void add(Product product) {
        selected.add(product);
    }
    @Override
    public void remove(Product product) {
        selected.remove(product);
    }

    @Override
    public int getCount() {
        return selected.size();
    }

    public void showProducts() {
         selected.stream()
                 .forEach(System.out::println);
    }

    public ShippingType getShipping() {
        return shipping;
    }

    public void setShipping(ShippingType shipping) {
        this.shipping = shipping;
    }
}
