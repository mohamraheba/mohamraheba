import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the number of devices they want to create
        System.out.print("Enter the number of devices to create (between 1 and 20): ");
        int numDevices = scanner.nextInt();

        // Validate the user input to ensure it's between 1 and 20
        if (numDevices < 1 || numDevices > 20) {
            System.out.println("Invalid input. Number of devices must be between 1 and 20.");
            scanner.close();
            return; // Exit the program
        }

        Random random = new Random();

        int distinctDeviceTypes = 3; // We have 3 derived classes: Smartphone, Laptop, Tablet
        double totalDevicePrice = 0;
        double totalDeviceWeight = 0;

        String[] smartphoneModels = {"Samsung", "Apple", "Google", "OnePlus", "Huawei"};
        String[] laptopModels = {"Lenovo", "Dell", "HP", "Acer", "Asus"};
        String[] tabletModels = {"Samsung", "Apple", "Lenovo", "Huawei", "Amazon"};

        for (int i = 0; i < numDevices; i++) {
            int randomDeviceType = random.nextInt(distinctDeviceTypes);
            String type;
            String model;
            double price;
            double weight;

            if (randomDeviceType == 0) {
                type = "Smartphone";
                model = smartphoneModels[random.nextInt(smartphoneModels.length)];
                price = 200 + random.nextDouble() * 800;
                weight = 100 + random.nextDouble() * 300;
                double screenSize = 4.0 + random.nextDouble() * 5.0;
                int cameraResolution = 5 + random.nextInt(16);
                Smartphone smartphone = new Smartphone(type, model, price, weight, screenSize, cameraResolution);
                totalDevicePrice += smartphone.getPrice();
                totalDeviceWeight += smartphone.getWeight();
                System.out.println("Device " + (i + 1) + ": " + smartphone.getType() +
                        ", Model: " + smartphone.getModel() +
                        ", Price: $" + smartphone.getPrice() +
                        ", Weight: " + smartphone.getWeight() + " grams");
            } else if (randomDeviceType == 1) {
                type = "Laptop";
                model = laptopModels[random.nextInt(laptopModels.length)];
                price = 500 + random.nextDouble() * 1500;
                weight = 1000 + random.nextDouble() * 2000;
                String processor = "Intel i" + (random.nextInt(9) + 1) + " Core";
                int ramSize = 4 + random.nextInt(9);
                Laptop laptop = new Laptop(type, model, price, weight, processor, ramSize);
                totalDevicePrice += laptop.getPrice();
                totalDeviceWeight += laptop.getWeight();
                System.out.println("Device " + (i + 1) + ": " + laptop.getType() +
                        ", Model: " + laptop.getModel() +
                        ", Price: $" + laptop.getPrice() +
                        ", Weight: " + laptop.getWeight() + " grams");
            } else {
                type = "Tablet";
                model = tabletModels[random.nextInt(tabletModels.length)];
                price = 100 + random.nextDouble() * 500;
                weight = 300 + random.nextDouble() * 700;
                String[] operatingSystems = {"Android", "iOS", "Windows"};
                String operatingSystem = operatingSystems[random.nextInt(operatingSystems.length)];
                boolean hasStylus = random.nextBoolean();
                Tablet tablet = new Tablet(type, model, price, weight, operatingSystem, hasStylus);
                totalDevicePrice += tablet.getPrice();
                totalDeviceWeight += tablet.getWeight();
                System.out.println("Device " + (i + 1) + ": " + tablet.getType() +
                        ", Model: " + tablet.getModel() +
                        ", Price: $" + tablet.getPrice() +
                        ", Weight: " + tablet.getWeight() + " grams");
            }
        }

        System.out.println("\nTotal distinct device types created: " + distinctDeviceTypes);
        System.out.println("Total price of all devices: $" + totalDevicePrice);
        System.out.println("Total weight of all devices: " + totalDeviceWeight + " grams");

        // Close the scanner
        scanner.close();
    }
}
