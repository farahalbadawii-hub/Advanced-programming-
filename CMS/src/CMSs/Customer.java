package CMSs;

public class Customer {
    private String name;
    private String address;
    private String nationalId;
    private String contact;
    private String category; // if the customer weren private or fleet or staff
    private Car car;

    public Customer(String name, String address, String nationalId, String contact, String category, Car car) {
        this.name = name;
        this.address = address;
        this.nationalId = nationalId;
        this.contact = contact;
        this.category = category;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getContact() {
        return contact;
    }

    public String getCategory() {
        return category;
    }

    public Car getCar() {
        return car;
    }

    public double getDiscountRate() {
        switch (category.toLowerCase()) {
            case "fleet": return 0.30;
            case "staff": return 0.50;
            default: return 0.0;
        }
    }
}
