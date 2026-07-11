package dsa.exercise6;

public class Main {
    public static void main(String[] args){
        Book[] books={
            new Book(101,"Algorithms","Thomas"),
            new Book(102,"Data Structures","Mark"),
            new Book(103,"Java","James"),
            new Book(104,"Networks","Andrew"),
            new Book(105,"Operating Systems","Galvin")
        };

        Book b1=BookSearch.linearSearch(books,"Java");

        if(b1!=null){
            System.out.println("Linear Search Result:");
            b1.display();
        }else{
            System.out.println("Book not found");
        }

        Book b2=BookSearch.binarySearch(books,"Networks");

        if(b2!=null){
            System.out.println("Binary Search Result:");
            b2.display();
        }else{
            System.out.println("Book not found");
        }
    }
}