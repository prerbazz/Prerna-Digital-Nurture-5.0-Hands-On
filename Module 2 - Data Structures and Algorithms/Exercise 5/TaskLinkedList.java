package dsa.exercise5;

public class TaskLinkedList {
    Task head=null;
    public void addTask(Task newTask){
        if(head==null){
            head=newTask;
            return;
        }
        Task temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newTask;
    }

    public void searchTask(int id){
        Task temp=head;
        while(temp!=null){
            if(temp.taskId==id){
                temp.display();
                return;
            }
            temp=temp.next;
        }
        System.out.println("Task not found");
    }

    public void traverseTasks(){
        Task temp=head;
        while(temp!=null){
            temp.display();
            temp=temp.next;
        }
    }

    public void deleteTask(int id){
        if(head==null){
            return;
        }
        if(head.taskId==id){
            head=head.next;
            System.out.println("Task deleted");
            return;
        }
        Task temp=head;
        while(temp.next!=null){
            if(temp.next.taskId==id){
                temp.next=temp.next.next;
                System.out.println("Task deleted");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Task not found");
    }
}