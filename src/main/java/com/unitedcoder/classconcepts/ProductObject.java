package com.unitedcoder.classconcepts;

public class ProductObject {
    private String ProductName;
    private String ProductCode;
    private String ProductWeight;
    private String StockLevel;
    private String Prices;

    public ProductObject() {
    }

    public ProductObject(String productName, String productCode, String productWeight, String stockLevel, String prices) {
        ProductName = productName;
        ProductCode = productCode;
        ProductWeight = productWeight;
        StockLevel = stockLevel;
        Prices = prices;
    }

    @Override
    public String toString() {
        return "ProductObject{" +
                "ProductName='" + ProductName + '\'' +
                ", ProductCode='" + ProductCode + '\'' +
                ", ProductWeight='" + ProductWeight + '\'' +
                ", StockLevel='" + StockLevel + '\'' +
                ", Prices='" + Prices + '\'' +
                '}';
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getProductWeight() {
        return ProductWeight;
    }

    public void setProductWeight(String productWeight) {
        ProductWeight = productWeight;
    }

    public String getStockLevel() {
        return StockLevel;
    }

    public void setStockLevel(String stockLevel) {
        StockLevel = stockLevel;
    }

    public String getPrices() {
        return Prices;
    }

    public void setPrices(String prices) {
        Prices = prices;
    }
}
