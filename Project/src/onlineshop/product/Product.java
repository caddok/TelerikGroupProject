package onlineshop.product;

import onlineshop.Supplier;

public class Product {
    private String name;
    private String brand;
    private String description;
    private Category category;
    private int stock;
    private double price;
    private Supplier supplier;

    public Product(String name, String brand, String description, Category category, int stock, double price, Supplier supplier) {
        setName(name);
        setBrand(brand);
        setDescription(description);
        setCategory(category);
        setStock(stock);
        setPrice(price);
        setSupplier(supplier);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCategory(Category category) {
        this.category = category;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public double getPrice() {
        return price;
    }
}
