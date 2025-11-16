package CMSs;

public class AppointmentObserver implements Observer {

    @Override
    public void update(Appointment appt) {
        System.out.println("New appointment added for: " + appt.getCustomer().getName());
    }
}
