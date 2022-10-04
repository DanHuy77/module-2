package case_study.model.rental_facility;

public class House extends Facility {
    private String roomStandard;
    private int floorNumber;

    public House() {
    }

    public House(String roomStandard, int floorNumber) {
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public House(String serviceName, double serviceUsedArea, int rentalCost, int maximumUser, String rentalType, String serviceCode, String roomStandard, int floorNumber) {
        super(serviceName, serviceUsedArea, rentalCost, maximumUser, rentalType, serviceCode);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    //    public House(String serviceName, double serviceUsedArea, int rentalCost, int maximumUser, String rentalType, String roomStandard, int floorNumber) {
//        super(serviceName, serviceUsedArea, rentalCost, maximumUser, rentalType);
//        this.roomStandard = roomStandard;
//        this.floorNumber = floorNumber;
//    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
