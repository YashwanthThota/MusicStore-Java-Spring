package com.emusicstore.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

@Entity//tells this is an entitiy
public class Product implements Serializable {

//Serializable is used for workflow method
    private static final long serialVersionUID = 3737314537698717689L;

    @Id//adds the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)//id will be produced in sequence aorder like 1,2,3...
    private int productId;

    ///////
    ///////@NotEmpty,@Min are Hibernate Validations
    ///////

    @NotEmpty(message = "The product name must not be null.")
    private String productName;
    private String productCategory;
    private String productDescription;

    @Min(value = 0, message = "The product name must not be less than zero.")
    private double productPrice;
    private String productCondition;
    private String productStatus;

    @Min(value = 0, message = "The product unit must not be less than zero.")
    private int unitInStock;
    private String productManufacturer;

    @Transient//it won't create a field for the product image it just creates the name cloumn
    private MultipartFile productImage;

    //map cartItemlist to product
    //cascadetype.ALL means if owner is delete the class depending on the entitiy will be deleted
    //fetch.eager means it will fetch the data from database always, if lazy  by default it won't fetch to db
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<CartItem> cartItemList;



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
}
