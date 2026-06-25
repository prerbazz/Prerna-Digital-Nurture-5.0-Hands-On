public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer gamingPc= new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGpu("RTX 4080")
                .build();
        Computer officePc= new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("512GB SSD")
                .build();
        System.out.println("Gaming PC Configuration:");
        gamingPc.displayConfiguration();
        System.out.println("Office PC Configuration:");
        officePc.displayConfiguration();
    }
}