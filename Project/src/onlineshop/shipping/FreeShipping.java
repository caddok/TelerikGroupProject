package onlineshop.shipping;

public class FreeShipping extends Shipping {
    final static String DELIVERY_TIME="1-2 Weeks";
    public final static double FREE_SHIPPING_PRICE = 0.0;
    @Override
    public void setType() {
        super.setType(ShippingType.FREE);
    }

    @Override
    public void setDeliveryTime() {
        super.setDeliveryTime(DELIVERY_TIME);
    }

    @Override
    public void setShippingAddress(String shippingAddress) {
        super.setShippingAddress(shippingAddress);
    }

    @Override
    public void setPrice() {
        super.price = FREE_SHIPPING_PRICE;
    }

    public FreeShipping(String address , double price){
        setType();
        setDeliveryTime();
        setShippingAddress(address);
        setPrice();
    }
}
        setPrice(price);
    }
}
