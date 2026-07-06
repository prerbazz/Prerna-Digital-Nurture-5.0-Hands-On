package dsa.exercise5;

public class Main {
    public static void main(String[] args){
        TaskLinkedList list=new TaskLinkedList();
        list.addTask(new Task(1,"Login Page","Pending"));
        list.addTask(new Task(2,"Payment Module","Completed"));
        list.addTask(new Task(3,"Database","Pending"));

        System.out.println("Tasks:");
        list.traverseTasks();

        System.out.println("\nSearch:");
        list.searchTask(2);

        System.out.println("\nDelete:");
        list.deleteTask(2);

        System.out.println("\nTasks After Delete:");
        list.traverseTasks();
    }
}