package onlineshop.users;

import onlineshop.product.Product;

import java.util.ArrayList;

public interface Cart {
    void giveOrder();

    void add(Product product);

    void remove(Product product);

    int getCount();

}