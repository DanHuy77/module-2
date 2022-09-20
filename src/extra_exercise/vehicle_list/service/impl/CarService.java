package extra_exercise.vehicle_list.service.impl;

import extra_exercise.vehicle_list.model.Car;
import extra_exercise.vehicle_list.service.IVehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements IVehicleService {
    private static final Scanner input = new Scanner(System.in);
    private static final List<Car> carsList = new ArrayList<>();

    public Car inputCarInformation() {
        System.out.print("Nhập biển kiểm soát xe: ");
        String licensePlates = input.nextLine();
        System.out.print("Nhập tên nhà sản xuất: ");
        String producer = input.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int producedYear = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên chủ sở hữu: ");
        String ownerName = input.nextLine();
        System.out.print("Nhập số chỗ ngồi trong xe: ");
        int seatsNumber = Integer.parseInt(input.nextLine());
        System.out.print("Nhập kiểu xe: ");
        String carType = input.nextLine();

        return new Car(licensePlates, producer, producedYear, ownerName, seatsNumber, carType);
    }


    @Override
    public void addVehicle() {
        Car car = this.inputCarInformation();
        carsList.add(car);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void showVehicleInformation() {
        if (carsList.size() != 0) {
            for (Car car : carsList) {
                System.out.println(car);
            }
        } else {
            System.out.println("Danh sách hiện tại không có phương tiện nào.");
        }
    }

    @Override
    public void removeVehicle(String licensePlates) {
//        System.out.print("Mời bạn nhập biển số xe oto cần xóa: ");
//        String licensePlates = input.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < carsList.size(); i++) {
            if (carsList.get(i).getLicensePlates().equals(licensePlates)) {
                System.out.println("Những xe oto khớp với tìm kiếm: ");
                System.out.println(carsList.get(i).toString());
                System.out.println("Bạn có chắc muốn xóa những xe có biển số này không? Nhập Y: yes, N: no");
                String choice = input.nextLine();
                if (choice.equals("Y")) {
                    carsList.remove(i);
                    System.out.println("Xóa xe oto thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy biển số xe oto cần xóa.");
        }

    }

    @Override
    public void trackingByLicensePlates(String licensePlates) {
        boolean trackingFlag = false;
        for (Car car : carsList) {
            if (car.getLicensePlates().contains(licensePlates)) {
                System.out.println("Những xe oto khớp với tìm kiếm: ");
                System.out.println(car.toString());
                trackingFlag = true;
            }
        }
        if (!trackingFlag) {
            System.out.println("Không tìm thấy xe oto khớp với mô tả");
        }
    }
}
