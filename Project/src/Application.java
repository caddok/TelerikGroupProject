import onlineshop.Supplier;
import onlineshop.product.Category;
import onlineshop.product.Product;
import onlineshop.users.RegularUser;
import onlineshop.users.User;

//ne gledai tova sa testove
public class Application {
    public static void main(String[] args) {
        User regular = new RegularUser("Johny","doesnt matter",
                "no phone","123456");
        Product newProduct = new Product("blabla","BLAbal","something something",
                Category.DRINKS,10,3.5,new Supplier("Regular supplier"));
        ((RegularUser) regular).getUserOrder().add(newProduct);
    }
}
