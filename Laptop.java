import java.util.Random;
class Laptop extends Device {
    private String model;
    private String processor;
    private int ramSize;

    public Laptop(String type, String model, double price, double weight, String processor, int ramSize) {
        super(type, price, weight);
        this.model = model;
        this.processor = processor;
        this.ramSize = ramSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
}