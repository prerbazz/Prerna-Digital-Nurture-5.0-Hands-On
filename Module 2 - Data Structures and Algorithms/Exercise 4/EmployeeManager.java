package dsa.exercise4;

public class EmployeeManager {
    Employee[] employees=new Employee[10];
    int count=0;

    public void addEmployee(Employee emp){
        if(count<employees.length){
            employees[count]=emp;
            count++;
        }else{
            System.out.println("Array is full");
        }
    }

    public void searchEmployee(int id){
        for(int i=0;i<count;i++){
            if(employees[i].getEmployeeId()==id){
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found");
    }

    public void traverseEmployees(){
        for(int i=0;i<count;i++){
            employees[i].display();
        }
    }

    public void deleteEmployee(int id){
        for(int i=0;i<count;i++){
            if(employees[i].getEmployeeId()==id){
                for(int j=i;j<count-1;j++){
                    employees[j]=employees[j+1];
                }

                employees[count-1]=null;
                count--;

                System.out.println("Employee deleted");
                return;
            }

        }
        System.out.println("Employee not found");
    }
}