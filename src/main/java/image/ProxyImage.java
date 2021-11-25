package image;

public class ProxyImage implements Image {
    private RealImage realImage;
    public String fileName;

    @Override
    public void display() {

    }
    public ProxyImage(String fileName) {
        this.fileName = fileName;
        this.realImage = new RealImage();

    }


}
