package extra_exercise.vehicle_list.service.impl;

import extra_exercise.vehicle_list.model.Truck;
import extra_exercise.vehicle_list.service.IVehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements IVehicleService {
    private static final Scanner input = new Scanner(System.in);
    private static final List<Truck> trucksList = new ArrayList<>();

    public Truck inputTruckInformation() {
        System.out.print("Nhập biển kiểm soát xe: ");
        String licensePlates = input.nextLine();
        System.out.print("Nhập tên nhà sản xuất: ");
        String producer = input.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int producedYear = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên chủ sở hữu: ");
        String ownerName = input.nextLine();
        System.out.print("Nhập trọng tải của xe: ");
        double truckLoad = Double.parseDouble(input.nextLine());
        return new Truck(licensePlates, producer, producedYear, ownerName, truckLoad);

    }

    @Override
    public void addVehicle() {
        Truck truck = this.inputTruckInformation();
        trucksList.add(truck);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void showVehicleInformation() {
        if (trucksList.size() != 0) {
            for (Truck truck : trucksList) {
                System.out.println(truck);
            }
        } else {
            System.out.println("Danh sách hiện tại không có phương tiện nào.");
        }
    }

    @Override
    public void removeVehicle(String licensePlates) {
//        System.out.print("Mời bạn biển số xe tải cần xóa: ");
//        String licensePlates = input.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < trucksList.size(); i++) {
            if (trucksList.get(i).getLicensePlates().equals(licensePlates)) {
                System.out.println("Những xe tải khớp với tìm kiếm: ");
                System.out.println(trucksList.get(i).toString());
                System.out.println("Bạn có chắc muốn xóa những xe có biển số này không? Nhập Y: yes, N: no");
                String choice = input.nextLine();
                if (choice.equals("Y")) {
                    trucksList.remove(i);
                    System.out.println("Xóa xe tải thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy biển số xe tải cần xóa.");
        }
    }

    @Override
    public void trackingByLicensePlates(String licensePlates) {
        boolean trackingFlag = false;
        for (Truck truck : trucksList) {
            if (truck.getLicensePlates().contains(licensePlates)) {
                System.out.println("Những xe khớp tải với tìm kiếm: ");
                System.out.println(truck.toString());
                trackingFlag = true;
            }
        }
        if (!trackingFlag) {
            System.out.println("Không tìm thấy xe tải khớp với mô tả");
        }
    }
}
