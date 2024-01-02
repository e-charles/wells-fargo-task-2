package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id 
    @GeneratedValue() 
    private long securityId;
    
    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String symbolName;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio,
     String purchaseDate, String symbolName, float purchasePrice,
     String category, float quantity) {
        this.portfolioId = portfolioId;
        this.purchaseDate = purchaseDate;
        this.symbolName = symbolName;
        this.purchasePrice = purchasePrice;
        this.category = category;
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}