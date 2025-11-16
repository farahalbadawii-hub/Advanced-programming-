package CMSs;

import java.time.LocalTime;
import java.util.ArrayList;

public class ServiceCenter {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public boolean availableSlot() {
        return appointments.size() < 9; // 9 AM to 5 PM (9 slots)
    }

    public Appointment appointmentsSchedual(Customer customer) {
        if (!availableSlot()) return null;

        LocalTime time = LocalTime.of(9 + appointments.size(), 0);
        Appointment appt = new Appointment(customer, time);
        appointments.add(appt);
        return appt;
    }

    public Appointment findwithID(String id) {
        for (Appointment appt : appointments) {
            if (appt.getCustomer().getNationalId().equals(id)) return appt;
        }
        return null;
    }

    public Appointment findByPlate(String plate) {
        for (Appointment appt : appointments) {
            if (appt.getCustomer().getCar().getPlateNumber().equalsIgnoreCase(plate)) return appt;
        }
        return null;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void printAppointments() {
        for (Appointment appt : appointments) {
            Customer c = appt.getCustomer();
            System.out.printf("%s - %s (%s %s, Plate: %s)\n",
                    appt.getTime(), c.getName(),
                    c.getCar().getMake(), c.getCar().getModel(),
                    c.getCar().getPlateNumber());
        }
    }
}
