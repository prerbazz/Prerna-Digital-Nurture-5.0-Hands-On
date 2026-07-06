package dsa.exercise3;

public class Main {
    public static void main(String[] args){
        Order[] orders1={
                new Order(101,"Prerna",4500),
                new Order(102,"Rahul",1200),
                new Order(103,"Anu",7800),
                new Order(104,"Kiran",2500)
        };

        System.out.println("Bubble Sort:");

        Sort.bubbleSort(orders1);

        for(Order o:orders1){
            o.display();
        }

        Order[] orders2={
                new Order(101,"Prerna",4500),
                new Order(102,"Rahul",1200),
                new Order(103,"Anu",7800),
                new Order(104,"Kiran",2500)
        };

        System.out.println("\nQuick Sort:");

        Sort.quickSort(orders2,0,orders2.length-1);

        for(Order o:orders2){
            o.display();
        }
    }
}