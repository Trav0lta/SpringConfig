package ua.com.owu.entity;

import javax.persistence.*;

/**
 * Created by User on 30.08.2017.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private User user;

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(String productName, User user) {
        this.productName = productName;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                '}';
    }
}
