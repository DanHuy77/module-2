package extra_exercise.vehicle_list.model;

public class Truck extends Vehicle {
    private double truckLoad;

    public Truck() {
    }

    public Truck(double truckLoad) {
        this.truckLoad = truckLoad;
    }

    public Truck(String licensePlates, String producer, int producedYear, String ownerName, double truckLoad) {
        super(licensePlates, producer, producedYear, ownerName);
        this.truckLoad = truckLoad;
    }

    public double getTruckLoad() {
        return truckLoad;
    }

    public void setTruckLoad(double truckLoad) {
        this.truckLoad = truckLoad;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "truckCapacity=" + truckLoad +
                '}';
    }
}
