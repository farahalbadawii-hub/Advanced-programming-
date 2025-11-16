package CMSs;

import java.util.Scanner;

public class FrontDeskStaff implements Worker {
    private Scanner scanner = new Scanner(System.in);

    public Customer customerRegistertion() {
        System.out.print("Full Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("National ID: ");
        String id = scanner.nextLine();
        System.out.print("Contact Number: ");
        String contact = scanner.nextLine();
        System.out.print("Category (private/fleet/staff): ");
        String category = scanner.nextLine();
        System.out.print("Car Make: ");
        String make = scanner.nextLine();
        System.out.print("Car Model: ");
        String model = scanner.nextLine();
        System.out.print("Car Plate Number: ");
        String plate = scanner.nextLine();

        Car car = new Car(make, model, plate);
        return new Customer(name, address, id, contact, category, car);
    }
    
    public void printBill(Appointment appt) {
        double discount = appt.getCustomer().getDiscountRate();
        double total = 50 * (1 - discount);
        System.out.printf("Service Cost: 50 JD\nDiscount: %.0f%%\nTotal Due: %.2f JD\n",
                discount * 100, total);
    }

    public void performDuties() {
        System.out.println("Front desk staff is registering customers and scheduling appointments");
    }
}
