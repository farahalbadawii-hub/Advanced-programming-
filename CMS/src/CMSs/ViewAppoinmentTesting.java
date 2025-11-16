package CMSs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ViewAppoinmentTesting {

    @Test
    public void testNoAppointments() {
        ServiceCenter center = new ServiceCenter();
        assertTrue(center.getAppointments().isEmpty());
    }

    @Test
    public void testOneAppointment() {
        ServiceCenter center = new ServiceCenter();
        Customer c = new Customer("Alaa", "City", "001", "071", "private", new Car("Toyota", "3", "Z333"));
        Appointment appt = center.appointmentsSchedual(c);
        assertTrue(center.getAppointments().contains(appt));
    }

    @Test
    public void testMultipleAppointments() {
        ServiceCenter center = new ServiceCenter();
        for (int i = 0; i < 3; i++) {
            Customer c = new Customer("User" + i, "City", "ID" + i, "07" + i, "fleet", new Car("B", "X", "P" + i));
            center.appointmentsSchedual(c);
        }
        assertEquals(3, center.getAppointments().size());
    }
}
