package extra_exercise.vehicle_list.service.impl;

import extra_exercise.vehicle_list.model.Motorcycle;
import extra_exercise.vehicle_list.service.IVehicleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorcycleService implements IVehicleService {
    private static final Scanner input = new Scanner(System.in);
    private static final List<Motorcycle> motorcyclesList = new ArrayList<>();

    public Motorcycle inputMotorcycleInformation() {
        System.out.print("Nhập biển kiểm soát xe: ");
        String licensePlates = input.nextLine();
        System.out.print("Nhập tên nhà sản xuất: ");
        String producer = input.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int producedYear = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên chủ sở hữu: ");
        String ownerName = input.nextLine();
        System.out.print("Nhập công suất của xe (ở vòng tua 7000 vòng/phút): ");
        int capacity = Integer.parseInt(input.nextLine());
        return new Motorcycle(licensePlates, producer, producedYear, ownerName, capacity);
    }

    @Override
    public void addVehicle() {
        Motorcycle motorcycle = this.inputMotorcycleInformation();
        motorcyclesList.add(motorcycle);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void showVehicleInformation() {
        if (motorcyclesList.size() != 0) {
            for (Motorcycle motorcycle : motorcyclesList) {
                System.out.println(motorcycle);
            }
        } else {
            System.out.println("Danh sách hiện tại không có phương tiện nào.");
        }
    }

    @Override
    public void removeVehicle(String licensePlates) {
//        System.out.print("Mời bạn biển số xe motor cần xóa: ");
//        String licensePlates = input.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < motorcyclesList.size(); i++) {
            if (motorcyclesList.get(i).getLicensePlates().equals(licensePlates)) {
                System.out.println("Những xe motor khớp với tìm kiếm: ");
                System.out.println(motorcyclesList.get(i).toString());
                System.out.println("Bạn có chắc muốn xóa những xe có biển số này không? Nhập Y: yes, N: no");
                String choice = input.nextLine();
                if (choice.equals("Y")) {
                    motorcyclesList.remove(i);
                    System.out.println("Xóa xe motor thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy biển số xe motor cần xóa.");
        }
    }

    @Override
    public void trackingByLicensePlates(String licensePlates) {
        boolean trackingFlag = false;
        for (Motorcycle motorcycle : motorcyclesList) {
            if (motorcycle.getLicensePlates().contains(licensePlates)) {
                System.out.println("Những xe motor khớp với tìm kiếm: ");
                System.out.println(motorcycle.toString());
                trackingFlag = true;
            }
        }
        if (!trackingFlag) {
            System.out.println("Không tìm thấy xe motor khớp với mô tả");
        }
    }
}
