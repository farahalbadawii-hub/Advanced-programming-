package CMSs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BillCalculateTesting {

    @Test
    public void testPrivateBill() {
        Customer customer = new Customer("ahmad", "Amman", "111", "999", "fleet", new Car("Toyota", "Yaris", "XYZ"));
        assertEquals(0.0, customer.getDiscountRate(), 0.01);
    }

    @Test
    public void testFleetBill() {
        Customer customer = new Customer("mohammad", "Ajloun", "232", "345", "private", new Car("Honda", "Civic", "ABC"));
        assertEquals(0.30, customer.getDiscountRate(), 0.01);
    }

    @Test
    public void testStaffBill() {
        Customer customer = new Customer("heba", "Irbid", "333", "678", "staff", new Car("Kia", "Sportage", "DEF"));
        assertEquals(0.50, customer.getDiscountRate(), 0.01);
    }
}
