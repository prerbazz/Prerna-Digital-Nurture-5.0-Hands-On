public class ProxyPatternTest {
    public static void main(String[] args) {
        Image img=new ProxyImage("nature.jpg");
        System.out.println("First Display:");
        img.display();
        System.out.println();
        System.out.println("Second Display:");
        img.display();
    }
}