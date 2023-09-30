import java.util.Random;
class Tablet extends Device {
    private String model;
    private String operatingSystem;
    private boolean hasStylus;

    public Tablet(String type, String model, double price, double weight, String operatingSystem, boolean hasStylus) {
        super(type, price, weight);
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.hasStylus = hasStylus;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }
}