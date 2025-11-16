package CMSs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppointmentSchedulingTest {

    @Test
    public void testSchedulewithNoRegistration() {
        ServiceCenter center = new ServiceCenter();
        Customer customer = null;
        Appointment appt = (customer != null) ? center.appointmentsSchedual(customer) : null;
        assertNull(appt);
    }

    @Test
    public void testScheduleAreFull() {
        ServiceCenter center = new ServiceCenter();

        for (int i = 0; i < 9; i++) {
            Customer c = new Customer("User" + i, "City", "ID" + i, "07" + i, "fleet", new Car("Brand", "Model", "PLT" + i));
            center.appointmentsSchedual(c);
        }

        Customer last = new Customer("Last", "City", "ID9", "070", "staff", new Car("Brand", "Model", "PLT9"));
        Appointment appt = center.appointmentsSchedual(last);

        assertNull(appt); 
    }

    @Test
    public void testSamePlateDifferentCustomer() {
        ServiceCenter center = new ServiceCenter();
        Car car = new Car("Dana", "badaei", "AAA111");

        Customer c1 = new Customer("User1", "City", "ID1", "070", "private", car);
        Customer c2 = new Customer("User2", "City", "ID2", "071", "fleet", car);

        assertNotNull(center.appointmentsSchedual(c1));
        assertNotNull(center.appointmentsSchedual(c2));
    }
}
