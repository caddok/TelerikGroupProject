package onlineshop.shipping;

public class ExpressShipping extends Shipping {
    final static String DELIVERY_TIME = "2-3 Days";

    @Override
    public void setType() {
        super.setType(ShippingType.EXPRESS);
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
    public void setPrice() {

    public void setPrice(double price) {
        super.price = price;
    }

    public ExpressShipping(String address , double price) {
        setType();
        setDeliveryTime();
        setShippingAddress(address);
        setPrice();
    }


}
        setPrice(price);
    }


}