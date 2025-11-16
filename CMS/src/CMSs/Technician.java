package CMSs;

import java.util.Scanner;

public class Technician implements Worker {
    private Scanner scanner = new Scanner(System.in);

    public void addDiagnosticNotes(Appointment appt) {
        System.out.print("Enter diagnostic notes: ");
        String notes = scanner.nextLine();
        appt.setDiagnosticnote(notes);
    }

    public void performDuties() {
        System.out.println("Technician is performing diagnostics");
    }
}
