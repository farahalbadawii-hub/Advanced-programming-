package CMSs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceCenter center = new ServiceCenter();
        FrontDeskStaff frontDesk = new FrontDeskStaff();
        Mechanic mechanic = new Mechanic();
        Technician technician = new Technician();
        ReportGenerator report = new ReportGenerator(); 

        while (true) {
            System.out.println("\n / CAR MAINTENANCE AND REPAIR CENTER / ");
            System.out.println("Login as:");
            System.out.println("1. Front Desk Staff");
            System.out.println("2. Mechanic");
            System.out.println("3. Technician");
            System.out.println("4. Generate Daily Report");
            System.out.println("5. Exit");
            System.out.print("Enter your service number: ");
            String staff = scanner.nextLine();

            switch (staff) {
                case "1":
                    frontDesk(scanner, frontDesk, center);
                    break;
                case "2":
                    mechanic(scanner, mechanic, center);
                    break;
                case "3":
                    technician(scanner, technician, center);
                    break;
                case "4":
                    report.generateReport(center.getAppointments()); 
                    break;
                case "5":
                    System.out.println("YOU LOGGED OUT!");
                    return;
                default:
                    System.out.println("Can't find this input");
            }
        }
    }

    private static void frontDesk(Scanner scanner, FrontDeskStaff frontDesk, ServiceCenter center) {
        Customer latestCustomer = null;

        while (true) {
            System.out.println("\n / FRONT DESK / ");
            System.out.println("1. Register Customer");
            System.out.println("2. Schedule Appointment");
            System.out.println("3. Print Bill");
            System.out.println("4. View Appointments");
            System.out.println("5. Logout");
            System.out.print("Enter your service number: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    latestCustomer = frontDesk.customerRegistertion();
                    break;
                case "2":
                    if (latestCustomer != null) {
                        Appointment appt = center.appointmentsSchedual(latestCustomer);
                        if (appt != null)
                            System.out.println("Scheduled at: " + appt.getTime());
                        else
                            System.out.println("No available slots.");
                    } else {
                        System.out.println("Please register a customer first.");
                    }
                    break;
                case "3":
                    System.out.print("Enter national ID: ");
                    Appointment appointmentBills = center.findwithID(scanner.nextLine());
                    if (appointmentBills != null)
                        frontDesk.printBill(appointmentBills);
                    else
                        System.out.println("No appointment found.");
                    break;
                case "4":
                    center.printAppointments();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Can't find this input");
            }
        }
    }

    private static void mechanic(Scanner scanner, Mechanic mechanic, ServiceCenter center) {
        while (true) {
            System.out.println("\n / MECHANIC / ");
            System.out.println("1. Add Repair Notes");
            System.out.println("2. View Appointments");
            System.out.println("3. Logout");
            System.out.print("Enter your service number: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter car plate number: ");
                    Appointment appt = center.findByPlate(scanner.nextLine());
                    if (appt != null)
                        mechanic.addRepairNotes(appt);
                    else
                        System.out.println("Appointment not found");
                    break;
                case "2":
                    center.printAppointments();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Can't find this input");
            }
        }
    }

    private static void technician(Scanner scanner, Technician technician, ServiceCenter center) {
        while (true) {
            System.out.println("\n / TECHNICIAN / ");
            System.out.println("1. Add Diagnostic Notes");
            System.out.println("2. View Appointments");
            System.out.println("3. Logout");
            System.out.print("Enter your service number: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter car plate number: ");
                    Appointment appt = center.findByPlate(scanner.nextLine());
                    if (appt != null)
                        technician.addDiagnosticNotes(appt);
                    else
                        System.out.println("Appointment not found");
                    break;
                case "2":
                    center.printAppointments();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Can't find this input");
            }
        }
    }
}
