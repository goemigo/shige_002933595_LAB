/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class DeliveryPackage {
    int packageId;
    double packageWeight;
    ArrayList<Product> products;
    Customer customer;
    
    public DeliveryPackage(){
        this.products = new ArrayList<Product>();
        this.customer = new Customer();
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public ArrayList<Product> getProductList() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public Product addProduct(int productId, String productName, double productPrice){
        
        Product p = new Product();
        p.setProductId(productId);
        p.setProductName(productName);
        p.setProductPrice(productPrice);
        
        products.add(p);
        
        return p;
        
    }
    
    //add find product method   
    public Product findProductById(int id){
        for (Product p: products){
            if (p.getProductId() == id){
                return p;
            }
        }
        return null;
    }
    
    
}
