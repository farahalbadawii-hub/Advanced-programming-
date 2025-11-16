package CMSs;

public class WorkerFactoryImp implements WorkerFactory {
    @Override
    public Worker createWorker(String type) {
        switch(type.toLowerCase()) {
            case "mechanic":
                return new Mechanic();
            case "technician":
                return new Technician();
            case "frontdesk":
                return new FrontDeskStaff();
            default:
                throw new IllegalArgumentException("Invalid worker type: " + type);
        }
    }
}
