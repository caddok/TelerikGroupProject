package onlineshop.shipping;

public class StandartShipping extends Shipping {

    final static String DELIVERY_TIME = "0-1 Week";

    @Override
    public void setType() {
        super.setType(ShippingType.STANDART);
    }
    @Override
    public void setShippingAddress(String shippingAddress) {
        super.setShippingAddress(shippingAddress);
    }

    @Override
    public void setDeliveryTime() {
        super.setDeliveryTime(DELIVERY_TIME);
    }


    @Override
    public void setPrice(double price) {
        super.price=price;
    }

    public StandartShipping(String address , double price) {
        setType();
        setDeliveryTime();
        setPrice(price);
        setShippingAddress(address);
    }
}
