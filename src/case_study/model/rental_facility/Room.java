package case_study.model.rental_facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double serviceUsedArea, int rentalCost, int maximumUser, String rentalType, String serviceCode, String freeService) {
        super(serviceName, serviceUsedArea, rentalCost, maximumUser, rentalType, serviceCode);
        this.freeService = freeService;
    }

    //    public Room(String serviceName, double serviceUsedArea, int rentalCost, int maximumUser, String rentalType, String freeService) {
//        super(serviceName, serviceUsedArea, rentalCost, maximumUser, rentalType);
//        this.freeService = freeService;
//    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
