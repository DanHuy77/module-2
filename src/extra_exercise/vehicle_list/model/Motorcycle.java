package extra_exercise.vehicle_list.model;

public class Motorcycle extends Vehicle {
    private int capacity;

    public Motorcycle() {
    }

    public Motorcycle(int capacity) {
        this.capacity = capacity;
    }

    public Motorcycle(String licensePlates, String producer, int producedYear, String ownerName, int capacity) {
        super(licensePlates, producer, producedYear, ownerName);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Motorcycle{" +
                "capacity=" + capacity + "at 7000times/minute" +
                '}';
    }
}
