import onlineshop.Supplier;
import onlineshop.order.Order;
import onlineshop.order.OrderList;
import onlineshop.product.Category;
import onlineshop.product.Product;
import onlineshop.product.StandardProduct;
import onlineshop.shipping.ShippingType;
import onlineshop.users.*;

//ne gledai tova sa testove
public class Application {
    public static void main(String[] args) {
        User regular = new RegularUser("John","dot dot dot","66461","blabla");
        Product newProduct = new StandardProduct("doesn't","matter","this is just a test",Category.ACCESSORIES,
                10,3.5,new Supplier("imaginable"));
        regular.getCart().add(newProduct);
        regular.giveOrder();
        User vip = new VipUser("some vip","dot dot","48798","wergtrhh");
        vip.getCart().add(newProduct);
        vip.giveOrder();
        OrderList orders = new OrderList();
        for (int i = 0; i < orders.getReceivedOrders().size(); i++) {
            System.out.println(orders.getReceivedOrders().get(i));
        }
    }
}
