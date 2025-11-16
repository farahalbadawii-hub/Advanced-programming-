package CMSs;

public class Car {
    private String make;
    private String model;
    private String plateNum;

    public Car(String make, String model, String plateNumber) {
        this.make = make;
        this.model = model;
        this.plateNum = plateNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getPlateNumber() {
        return plateNum;
    }
}
