package extra_exercise.vehicle_list.controller;

import extra_exercise.vehicle_list.service.IVehicleService;
import extra_exercise.vehicle_list.service.impl.CarService;
import extra_exercise.vehicle_list.service.impl.MotorcycleService;
import extra_exercise.vehicle_list.service.impl.TruckService;

import java.util.Scanner;

public class VehicleController {
    private static final IVehicleService iCarService = new CarService();
    private static final IVehicleService iTruckService = new TruckService();
    private static final IVehicleService iMotorcycleService = new MotorcycleService();
    private static final Scanner scanner = new Scanner(System.in);
    static String licensePlates;

    public static void vehiclesMenu() {

        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý phương tiện giao thông");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị danh sách phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm phương tiện theo biển kiểm soát");
            System.out.println("5. Thoát\n");
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("- Hãy lựa chọn -");
                    System.out.println("1. Thêm mới xe oto");
                    System.out.println("2. Thêm mới xe tải");
                    System.out.println("3. Thêm mới xe motor\n");
                    System.out.print("Nhập lựa chọn: ");
                    int secondChoice = Integer.parseInt(scanner.nextLine());
                    if (secondChoice == 1) {
                        iCarService.addVehicle();
                    } else if (secondChoice == 2) {
                        iTruckService.addVehicle();
                    } else if (secondChoice == 3) {
                        iMotorcycleService.addVehicle();
                    } else {
                        System.out.println("Lựa chọn sai, xin chọn lại");
                    }

                    break;
                case 2:
                    System.out.println("- Hãy lựa chọn -");
                    System.out.println("1. Hiển thị danh sách xe oto");
                    System.out.println("2. Hiển thị danh sách xe tải");
                    System.out.println("3. Hiển thị danh sách xe motor\n");
                    System.out.print("Nhập lựa chọn: ");
                    int thirdChoice = Integer.parseInt(scanner.nextLine());
                    if (thirdChoice == 1) {
                        iCarService.showVehicleInformation();
                    } else if (thirdChoice == 2) {
                        iTruckService.showVehicleInformation();
                    } else if (thirdChoice == 3) {
                        iMotorcycleService.showVehicleInformation();
                    } else {
                        System.out.println("Lựa chọn sai, xin chọn lại");
                    }
                    break;
                case 3:
                    System.out.println("Mời nhập biển số xe");

                    licensePlates = scanner.nextLine();

                    iCarService.removeVehicle(licensePlates);

                    iTruckService.removeVehicle(licensePlates);

                    iMotorcycleService.removeVehicle(licensePlates);
                    break;
                case 4:
                    System.out.println("Hãy nhập biển số xe bạn muốn tìm kiếm");
                    licensePlates = scanner.nextLine();
                    iCarService.trackingByLicensePlates(licensePlates);
                    iTruckService.trackingByLicensePlates(licensePlates);
                    iMotorcycleService.trackingByLicensePlates(licensePlates);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}