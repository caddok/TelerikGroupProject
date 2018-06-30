package onlineshop.users;


import onlineshop.Product;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> userProducts;

    public Cart() {
        userProducts = new ArrayList<>();
    }

    public void add(Product product) {
       // userProducts.add(product);
    }

    public void delete(String productName) {
      //  if (userProducts.contains(productName)) {
     //       userProducts.remove(productName);
     //   }
    }

    public int count(){
      //  return userProducts.size();
        return 0;
    }
<<<<<<< HEAD

}
=======
}
>>>>>>> nmateev-master
