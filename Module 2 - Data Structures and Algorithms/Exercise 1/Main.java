package dsa.exercise1;

public class Main {
    public static void main(String[] args){
        Inventory inv=new Inventory();
        inv.addProduct(new Product(101,"Laptop",10,55000));
        inv.addProduct(new Product(102,"Mouse",50,600));
        inv.addProduct(new Product(103,"Keyboard",25,1200));

        System.out.println("Inventory:");
        inv.displayProducts();

        inv.updateProduct(102,45,650);

        System.out.println("\nAfter Update:");
        inv.displayProducts();

        inv.deleteProduct(103);

        System.out.println("\nAfter Delete:");
        inv.displayProducts();
    }
}