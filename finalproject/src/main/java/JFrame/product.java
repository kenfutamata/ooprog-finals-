/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame;

/**
 *
 * @author kenfu
 */
public class product{
    private String productcode; 
    private String description; 
    private int qty; 
    private int price;
    
    public product(String productcode, String description, int qty, int price){
        this.productcode = productcode; 
        this.description = description; 
        this.qty = qty; 
        this.price = price;  
    }
    
    public void setProductcode(String productcode){
        this.productcode = productcode;
    }
    
    public String getProductCode(){
        return productcode; 
    }
    
    public void setDescription(String description){
        this.description = description; 
    }
    
    public String getDescription(){
        return description; 
    }
    
    public void setQty(int qty){
        this.qty = qty; 
    }
    
    public int getQty(){
        return qty; 
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return price; 
    }
}

