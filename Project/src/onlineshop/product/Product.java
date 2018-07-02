package onlineshop.product;

import onlineshop.Supplier;

<<<<<<< HEAD
public class Product {
=======
public abstract class Product {

    private int id;
>>>>>>> 13fa4b04afca191bf6d70c492590a0b350d52c7b
    private String name;
    private String brand;
    private String description;
    private Category category;
    private int stock;
    private double price;
    private Supplier supplier;

<<<<<<< HEAD
    public Product(String name, String brand, String description, Category category, int stock, double price, Supplier supplier) {
=======

    Product(int id,String name, String brand, String description, Category categoryType, int stock, double price, Supplier supplier) {
        setId(id);
>>>>>>> 13fa4b04afca191bf6d70c492590a0b350d52c7b
        setName(name);
        setBrand(brand);
        setDescription(description);
        setCategory(category);
        setStock(stock);
        setPrice(price);
        setSupplier(supplier);
<<<<<<< HEAD
    }

=======
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategoryType() {
        return categoryType;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void showProduct() {
        StringBuilder productInfo = new StringBuilder();
        productInfo
                .append(this.getName()).append(", Brand: ").append(this.getBrand())
                .append(", Description: ").append(this.getDescription())
                .append(", Price: ").append(this.getPrice())
                .append(", Stock: ").append(this.getStock());
        System.out.println(productInfo);

    }

    @Override
    public String toString() {
        StringBuilder currentProduct = new StringBuilder();
        currentProduct
                .append(this.getName()).append(", Brand: ").append(this.getBrand());

        return currentProduct.toString();
    }

    private void setId(int id) {
        this.id = id;
    }


>>>>>>> 13fa4b04afca191bf6d70c492590a0b350d52c7b
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
