package extra_exercise.vehicle_list.model;

public abstract class Vehicle {
    private String licensePlates;
    private String Producer;
    private int producedYear;
    private String ownerName;

    public Vehicle() {
    }

    public Vehicle(String licensePlates, String producer, int producedYear, String ownerName) {
        this.licensePlates = licensePlates;
        Producer = producer;
        this.producedYear = producedYear;
        this.ownerName = ownerName;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public int getProducedYear() {
        return producedYear;
    }

    public void setProducedYear(int producedYear) {
        this.producedYear = producedYear;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlates='" + licensePlates + '\'' +
                ", Producer='" + Producer + '\'' +
                ", producedYear=" + producedYear +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
