package com.example.customlistview;

public class Product {

    private String title;
    private String description;
    private String type;
    private Double price;
    private Boolean sale;

    public Product(String title, String description, String type, Double price, Boolean sale) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.price = price;
        this.sale = sale;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getSale() {
        return sale;
    }
}
