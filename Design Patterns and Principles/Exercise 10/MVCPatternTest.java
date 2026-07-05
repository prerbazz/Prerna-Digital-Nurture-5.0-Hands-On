public class MVCPatternTest {
    public static void main(String[] args){
        Student student=new Student("Prerna",101,"A");
        StudentView view=new StudentView();

        StudentController controller=new StudentController(student,view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Prem");
        controller.setStudentGrade("A+");

        System.out.println("After Update");
        controller.updateView();
    }
}