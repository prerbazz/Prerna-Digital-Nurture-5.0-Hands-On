public class ProxyImage implements Image {
    private String filename;
    private RealImage realimg;
    public ProxyImage(String filename) {
        this.filename=filename;
    }
    @Override
    public void display() {
        if(realimg==null) {
            realimg=new RealImage(filename);
        }
        realimg.display();
    }
}