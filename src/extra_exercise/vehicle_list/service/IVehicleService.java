package extra_exercise.vehicle_list.service;

public interface IVehicleService {
    void addVehicle();
    void showVehicleInformation();
    void removeVehicle(String licensePlates);
    void trackingByLicensePlates(String licensePlates);
}
