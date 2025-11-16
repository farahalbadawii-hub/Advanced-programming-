package CMSs;

import java.time.LocalTime;

public class Appointment {
    private Customer customer;
    private LocalTime time;
    private String repairNote = "";
    private String diagnosticNote = "";

    public Appointment(Customer customer, LocalTime time) {
        this.customer = customer;
        this.time = time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getRepairnote() {
        return repairNote;
    }

    public void setRepairnote(String notes) {
        this.repairNote = notes;
    }

    public String getDiagnosticnote() {
        return diagnosticNote;
    }

    public void setDiagnosticnote(String notes) {
        this.diagnosticNote = notes;
    }
}
