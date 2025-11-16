package CMSs;

import java.util.Scanner;

public class Mechanic implements Worker {
    private Scanner scanner = new Scanner(System.in);

    public void addRepairNotes(Appointment appt) {
        System.out.print("Enter repair notes: ");
        String notes = scanner.nextLine();
        appt.setRepairnote(notes);
    }

    public void performDuties() {
        System.out.println("Mechanic is working on car repairs.");
    }
}
