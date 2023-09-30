import java.util.Random;
class Smartphone extends Device {
    private String model;
    private double screenSize;
    private int cameraResolution;

    public Smartphone(String type, String model, double price, double weight, double screenSize, int cameraResolution) {
        super(type, price, weight);
        this.model = model;
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}