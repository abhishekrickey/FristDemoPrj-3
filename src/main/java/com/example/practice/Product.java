package com.example.practice;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pid;
    
    private String name;
    private String description;
    private String purchased;
    private int qty;
    private double price;
    
    // Default constructor
    public Product() {
    }
    
    // Parameterized constructor
    public Product(String name, String description, int qty, double price) {
        this.name = name;
        this.description = description;
        this.qty = qty;
        this.price = price;
    }
    
    // Getters and Setters
    public long getPid() {
        return pid;
    }
    
    public void setPid(long pid) {
        this.pid = pid;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getPurchased() {
        return purchased;
    }
    
    public void setPurchased(String purchased) {
        this.purchased = purchased;
    }
    
    public int getQty() {
        return qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}


/*
 * import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue;
 * import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
 * import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="productdemo")
 * 
 * public class Product {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.IDENTITY)
 * 
 * private long pid; private String description; private String purchased; int
 * qty; double price;
 * 
 * public Product(){
 * 
 * }
 * 
 * public String getDescription() { return description; }
 * 
 * public void setDescription(String description) { this.description =
 * description; }
 * 
 * public String getPurchased() { return purchased; }
 * 
 * public void setPurchased(String purchased) { this.purchased = purchased; }
 * 
 * }
 * 
 */