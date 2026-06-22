public class SingletonTesting {
    public static void main(String[] args){
        Logger l1=Logger.getInstance();
        l1.log("First log message!");
        Logger l2=Logger.getInstance();
        l2.log("Second log message!");
        System.out.println("Logger1 Hashcode: "+l1.hashCode());
        System.out.println("Logger2 Hashcode: "+l2.hashCode());
        if(l1==l2){
            System.out.println("Only one Logger instance exists.");
        } else{
            System.out.println("Multiple Logger instances exist.");
        }
    }
}
