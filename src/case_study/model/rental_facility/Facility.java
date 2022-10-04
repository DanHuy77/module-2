package case_study.model.rental_facility;

public abstract class Facility {
    private String serviceName;
    private double serviceUsedArea;
    private int rentalCost;
    private int maximumUser;
    private String rentalType;
    private String serviceCode;

    public Facility() {
    }

    public Facility(String serviceName, double serviceUsedArea, int rentalCost, int maximumUser, String rentalType, String serviceCode) {
        this.serviceName = serviceName;
        this.serviceUsedArea = serviceUsedArea;
        this.rentalCost = rentalCost;
        this.maximumUser = maximumUser;
        this.rentalType = rentalType;
        this.serviceCode = serviceCode;
    }

//    public Facility(String serviceName, double serviceUsedArea, int rentalCost, int maximumUser, String rentalType) {
//        this.serviceName = serviceName;
//        this.serviceUsedArea = serviceUsedArea;
//        this.rentalCost = rentalCost;
//        this.maximumUser = maximumUser;
//        this.rentalType = rentalType;
//    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceUsedArea() {
        return serviceUsedArea;
    }

    public void setServiceUsedArea(double serviceUsedArea) {
        this.serviceUsedArea = serviceUsedArea;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumUser() {
        return maximumUser;
    }

    public void setMaximumUser(int maximumUser) {
        this.maximumUser = maximumUser;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceUsedArea=" + serviceUsedArea +
                ", rentalCost=" + rentalCost +
                ", maximumUser=" + maximumUser +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
