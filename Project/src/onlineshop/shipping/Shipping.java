package onlineshop.shipping;

public abstract class Shipping {
    private ShippingType type;

    // onlineshop.shipping price
    protected double price;

    //delivery time
    private String deliveryTime;

    //shipping address
    private String shippingAddress;

    public void setType(ShippingType type) {
            this.type = type;
    }

    public abstract void setPrice();

    public void setDeliveryTime(String deliveryTime){

        this.deliveryTime = deliveryTime;
    }

    public abstract void setType();

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ShippingType getType() {
        return type;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setDeliveryTime();
}
