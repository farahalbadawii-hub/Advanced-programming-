package CMSs;

import java.util.ArrayList;

public class ReportGenerator {

    public void generateReport(ArrayList<Appointment> appointments) {
        System.out.println("\n \\ DAILY SERVICE REPORT //");
        for (Appointment appt : appointments) {
            printAppointmentDetails(appt);
        }
    }

    private void printAppointmentDetails(Appointment appt) {
        Customer c = appt.getCustomer();
        System.out.println("\n-------------------------------");
        System.out.println("Customer National ID: " + c.getNationalId());
        System.out.println("Car Plate: " + c.getCar().getPlateNumber());
        System.out.println("Appointment Time: " + appt.getTime());
        System.out.println("Repair Notes: " + appt.getRepairnote());
        System.out.println("Diagnostic Notes: " + appt.getDiagnosticnote());
    }
}
