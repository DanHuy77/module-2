package extra_exercise.vehicle_list.model;

public class Car extends Vehicle {
    private int seatsNumber;
    private String carType;

    public Car() {
    }

    public Car(int seatsNumber, String carType) {
        this.seatsNumber = seatsNumber;
        this.carType = carType;
    }

    public Car(String licensePlates, String producer, int producedYear, String ownerName, int seatsNumber, String carType) {
        super(licensePlates, producer, producedYear, ownerName);
        this.seatsNumber = seatsNumber;
        this.carType = carType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "seatsNumber=" + seatsNumber +
                ", carType='" + carType + '\'' +
                '}';
    }
}
