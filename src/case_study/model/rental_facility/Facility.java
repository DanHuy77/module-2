package case_study.model.rental_facility;

public abstract class Facility {
    private String serviceName;
    private double serviceUsedArea;
    private double rentalCost;
    private int maximumUser;
    private String rentalType;
    private String serviceCode;

    public Facility() {
    }

    public Facility(String serviceName, double serviceUsedArea, double rentalCost, int maximumUser, String rentalType, String serviceCode) {
        this.serviceName = serviceName;
        this.serviceUsedArea = serviceUsedArea;
        this.rentalCost = rentalCost;
        this.maximumUser = maximumUser;
        this.rentalType = rentalType;
        this.serviceCode = serviceCode;
    }

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

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
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

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceUsedArea=" + serviceUsedArea +"m2"+
                ", rentalCost=" + rentalCost +
                ", maximumUser=" + maximumUser +
                ", rentalType='" + rentalType + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
}
