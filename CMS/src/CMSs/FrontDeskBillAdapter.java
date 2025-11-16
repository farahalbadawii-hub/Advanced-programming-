package CMSs;

public class FrontDeskBillAdapter implements BillPrint {
    private FrontDeskStaff frontDesk;

    public FrontDeskBillAdapter(FrontDeskStaff frontDesk) {
        this.frontDesk = frontDesk;
    }

    @Override
    public void printBill(Customer customer) {
        Appointment appt = new ServiceCenter().findwithID(customer.getNationalId());
        if (appt != null) {
            frontDesk.printBill(appt);
        } else {
            System.out.println("Appointment not found");
        }
    }
}
