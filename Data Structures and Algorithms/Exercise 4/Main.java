package dsa.exercise4;

public class Main {
    public static void main(String[] args){
        EmployeeManager em=new EmployeeManager();
        em.addEmployee(new Employee(101,"Prerna","Developer",60000));
        em.addEmployee(new Employee(102,"Rahul","Tester",45000));
        em.addEmployee(new Employee(103,"Anu","Manager",85000));

        System.out.println("Employees:");
        em.traverseEmployees();

        System.out.println("\nSearch:");
        em.searchEmployee(102);

        System.out.println("\nDelete:");
        em.deleteEmployee(102);

        System.out.println("\nEmployees After Delete:");
        em.traverseEmployees();
    }
}