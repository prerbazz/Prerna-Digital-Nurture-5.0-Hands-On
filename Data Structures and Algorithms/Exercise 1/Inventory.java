package dsa.exercise1;

import java.util.HashMap;

public class Inventory {
    HashMap<Integer,Product> products=new HashMap<>();
    public void addProduct(Product p){
        products.put(p.getProductId(),p);
    }
    
    public void updateProduct(int id,int qty,double price){
        Product p=products.get(id);

        if(p!=null){
            p.setQuantity(qty);
            p.setPrice(price);
        }else{
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(int id){
        products.remove(id);
    }

    public void displayProducts(){
        for(Product p:products.values()){
            p.display();
        }
    }
}