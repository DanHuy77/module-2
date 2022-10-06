package case_study.service.impl;

import case_study.controller.FuramaController;
import case_study.model.human.Employee;
import case_study.model.rental_facility.Facility;
import case_study.model.rental_facility.House;
import case_study.model.rental_facility.Room;
import case_study.model.rental_facility.Villa;
import case_study.service.IFacilityService;
import case_study.utils.exception.CaseStudyFormatException;
import case_study.utils.unique_properties.UniqueProperties;

import java.io.*;
import java.util.*;


public class FacilityService implements IFacilityService {
    public Scanner input = new Scanner(System.in);
    public static LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
    public static ArrayList<Facility> maintainFacility = new ArrayList<>();

    public Villa getVillaInfo() {
        String serviceName;
        while (true) {
            try {
                System.out.print("Input Service Name: ");
                CaseStudyFormatException.nameCheck(serviceName = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double serviceUsedArea;
        while (true) {
            try {
                System.out.print("Input Service used Area: ");
                CaseStudyFormatException.areaCheck(serviceUsedArea = Double.parseDouble(input.nextLine()));
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Input Rental Cost: ");
        double rentalCost = Double.parseDouble(input.nextLine());
        int maximumUsers;
        while (true) {
            try {
                System.out.print("Input Maximum Users: ");
                CaseStudyFormatException.userNumberCheck(maximumUsers = Integer.parseInt(input.nextLine()));
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String rentalType;
        while (true) {
            try {
                System.out.print("Input Rental Type: ");
                CaseStudyFormatException.nameCheck(rentalType = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String serviceCode;
        while (true) {
            try {
                System.out.print("Input Service Code: ");
                CaseStudyFormatException.villaCodeCheck(serviceCode = input.nextLine());
                CaseStudyFormatException.serviceCodeUniqueCheck(serviceCode);
                UniqueProperties.facilityServiceCodeList.add(serviceCode);
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String roomStandard;
        while (true) {
            try {
                System.out.print("Input Room Standard: ");
                CaseStudyFormatException.nameCheck(roomStandard = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double poolArea;
        while (true) {
            try {
                System.out.print("Input Pool Area: ");
                CaseStudyFormatException.areaCheck(poolArea = Double.parseDouble(input.nextLine()));
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        int floorNumber;
        while (true) {
            try {
                System.out.print("Input Floor Number: ");
                CaseStudyFormatException.floorNumberCheck(floorNumber = Integer.parseInt(input.nextLine()));
                break;
            } catch (NumberFormatException | CaseStudyFormatException exception) {
                System.out.println(exception.getMessage());
            }
        }
        return new Villa(serviceName, serviceUsedArea, rentalCost, maximumUsers, rentalType, serviceCode, roomStandard, poolArea, floorNumber);
    }

    public House getHouseInfo() {
        String serviceName;
        while (true) {
            try {
                System.out.print("Input Service Name: ");
                CaseStudyFormatException.nameCheck(serviceName = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        double serviceUsedArea;
        while (true) {
            try {
                System.out.print("Input Service used Area: ");
                CaseStudyFormatException.areaCheck(serviceUsedArea = Double.parseDouble(input.nextLine()));
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Input Rental Cost: ");
        double rentalCost = Double.parseDouble(input.nextLine());

        int maximumUsers;
        while (true) {
            try {
                System.out.print("Input Maximum Users: ");
                CaseStudyFormatException.userNumberCheck(maximumUsers = Integer.parseInt(input.nextLine()));
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String rentalType;
        while (true) {
            try {
                System.out.print("Input Rental Type: ");
                CaseStudyFormatException.nameCheck(rentalType = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String serviceCode;
        while (true) {
            try {
                System.out.print("Input Service Code: ");
                CaseStudyFormatException.houseCodeCheck(serviceCode = input.nextLine());
                CaseStudyFormatException.serviceCodeUniqueCheck(serviceCode);
                UniqueProperties.facilityServiceCodeList.add(serviceCode);
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String roomStandard;
        while (true) {
            try {
                System.out.print("Input Room Standard: ");
                CaseStudyFormatException.nameCheck(roomStandard = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        int floorNumber;
        while (true) {
            try {
                System.out.print("Input Floor Number: ");
                CaseStudyFormatException.floorNumberCheck(floorNumber = Integer.parseInt(input.nextLine()));
                break;
            } catch (NumberFormatException | CaseStudyFormatException exception) {
                System.out.println(exception.getMessage());
            }
        }
        return new

                House(serviceName, serviceUsedArea, rentalCost, maximumUsers, rentalType, serviceCode, roomStandard, floorNumber);

    }

    public Room getRoomInfo() {
        String serviceName;
        while (true) {
            try {
                System.out.print("Input Service Name: ");
                CaseStudyFormatException.nameCheck(serviceName = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        double serviceUsedArea;
        while (true) {
            try {
                System.out.print("Input Service used Area: ");
                CaseStudyFormatException.areaCheck(serviceUsedArea = Double.parseDouble(input.nextLine()));
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Input Rental Cost: ");
        double rentalCost = Double.parseDouble(input.nextLine());

        int maximumUsers;
        while (true) {
            try {
                System.out.print("Input Maximum Users: ");
                CaseStudyFormatException.userNumberCheck(maximumUsers = Integer.parseInt(input.nextLine()));
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String rentalType;
        while (true) {
            try {
                System.out.print("Input Rental Type: ");
                CaseStudyFormatException.nameCheck(rentalType = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String serviceCode;
        while (true) {
            try {
                System.out.print("Input Service Code: ");
                CaseStudyFormatException.roomCodeCheck(serviceCode = input.nextLine());
                CaseStudyFormatException.serviceCodeUniqueCheck(serviceCode);
                UniqueProperties.facilityServiceCodeList.add(serviceCode);
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String freeService;
        while (true) {
            try {
                System.out.print("Input Free Services: ");
                CaseStudyFormatException.nameCheck(freeService = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return new

                Room(serviceName, serviceUsedArea, rentalCost, maximumUsers, rentalType, serviceCode, freeService);

    }


    @Override
    public void displayList() throws IOException {
        try {
            facilityMap = readFileHouse();
            facilityMap.putAll(readFileVilla());
            facilityMap.putAll(readFileRoom());
            Set<Facility> keys = facilityMap.keySet();
            if (!keys.isEmpty()) {
                for (Facility key : keys) {
                    System.out.println(key.toString());

                }
            } else {
                System.out.println("There is no Facility in list!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Facility Data is Empty!");
        }
    }

    public void addNewVilla() throws IOException {
        Villa villa = this.getVillaInfo();
        facilityMap.put(villa, 0);
        writeFileVilla(facilityMap);
        System.out.println("Added new Villa.");
    }

    public void addNewHouse() throws IOException {
        House house = this.getHouseInfo();
        facilityMap.put(house, 0);
        writeFileHouse(facilityMap);
        System.out.println("Added new House.");
    }

    public void addNewRoom() throws IOException {
        Room room = this.getRoomInfo();
        facilityMap.put(room, 0);
        writeFileRoom(facilityMap);
        System.out.println("Added new Room");
    }

    @Override
    public void addNew() throws IOException, CaseStudyFormatException {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Choice must be a number digit, please try again.");
            }
        }
        switch (choice) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                FuramaController.displayMainMenu();
            default:
                System.out.println("Please choose from 1 to 4.");
        }
    }

    public static void addFacilityMaintenance() {
        Set<Facility> keys = facilityMap.keySet();
        for (Facility key : keys) {
            if (facilityMap.get(key) >= 5) {
                maintainFacility.add(key);
            }
        }
    }

    public static void displayFacilityMaintenance() {
        if (maintainFacility.size() != 0) {
            for (int i = 0; i < maintainFacility.size(); i++) {
                System.out.println(maintainFacility.get(i).toString());
            }
        } else {
            System.out.println("Empty List.");
        }
    }

    private String villaFileForm(Villa villa) {
        return villa.getServiceName() + "," + villa.getServiceUsedArea() + "," + villa.getRentalCost() + "," + villa.getMaximumUser() + "," + villa.getRentalType() + "," + villa.getServiceCode() + "," + villa.getRoomStandard() + "," + villa.getPoolArea() + "," + villa.getFloorNumber();
    }

    private String houseFileForm(House house) {
        return house.getServiceName() + "," + house.getServiceUsedArea() + "," + house.getRentalCost() + "," + house.getMaximumUser() + "," + house.getRentalType() + "," + house.getServiceCode() + "," + house.getRoomStandard() + "," + house.getFloorNumber();
    }

    private String roomFileForm(Room room) {
        return room.getServiceName() + "," + room.getServiceUsedArea() + "," + room.getRentalCost() + "," + room.getMaximumUser() + "," + room.getRentalType() + "," + room.getServiceCode() + "," + room.getFreeService();
    }


    private void writeFileVilla(LinkedHashMap<Facility, Integer> facilityMap) throws IOException {
        Set<Facility> keys = facilityMap.keySet();
        File file = new File("src\\case_study\\data\\villa.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Facility key : keys) {
            if (key.getServiceCode().contains("VL")) {
                bufferedWriter.write(villaFileForm((Villa) key));
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }

    private void writeFileHouse(LinkedHashMap<Facility, Integer> facilityMap) throws IOException {
        File file = new File("src\\case_study\\data\\house.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        Set<Facility> keys = facilityMap.keySet();
        for (Facility key : keys) {
            if (key.getServiceCode().contains("HO")) {
                bufferedWriter.write(houseFileForm((House) key));
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }

    private void writeFileRoom(LinkedHashMap<Facility, Integer> facilityMap) throws IOException {

        File file = new File("src\\case_study\\data\\room.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        Set<Facility> keys = facilityMap.keySet();
        for (Facility key : keys) {
            if (key.getServiceCode().contains("RO")) {
                bufferedWriter.write(roomFileForm((Room) key));
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }

    private LinkedHashMap<Facility, Integer> readFileVilla() throws IOException {
        File file = new File("src\\case_study\\data\\villa.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
        String line;
        String[] properties;
        Villa villa;
        while ((line = bufferedReader.readLine()) != null) {
            properties = line.split(",");
            UniqueProperties.facilityServiceCodeList.add(properties[5]);
            villa = new Villa(properties[0], Double.parseDouble(properties[1]), Double.parseDouble(properties[2]), Integer.parseInt(properties[3]), properties[4], properties[5], properties[6], Double.parseDouble(properties[7]), Integer.parseInt(properties[8]));
            facilityMap.put(villa, 0);
        }
        bufferedReader.close();
        return facilityMap;
    }

    private LinkedHashMap<Facility, Integer> readFileHouse() throws IOException {
        File file = new File("src\\case_study\\data\\house.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
        String line;
        String[] properties;
        House house;
        while ((line = bufferedReader.readLine()) != null) {
            properties = line.split(",");
            UniqueProperties.facilityServiceCodeList.add(properties[5]);
            house = new House(properties[0], Double.parseDouble(properties[1]), Double.parseDouble(properties[2]), Integer.parseInt(properties[3]), properties[4], properties[5], properties[6], Integer.parseInt(properties[7]));
            facilityMap.put(house, 0);
        }
        bufferedReader.close();
        return facilityMap;
    }

    private LinkedHashMap<Facility, Integer> readFileRoom() throws IOException {
        File file = new File("src\\case_study\\data\\room.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
        String line;
        String[] properties;
        Room room;
        while ((line = bufferedReader.readLine()) != null) {
            properties = line.split(",");
            UniqueProperties.facilityServiceCodeList.add(properties[5]);
            room = new Room(properties[0], Double.parseDouble(properties[1]), Double.parseDouble(properties[2]), Integer.parseInt(properties[3]), properties[4], properties[5], properties[6]);
            facilityMap.put(room, 0);
        }
        bufferedReader.close();
        return facilityMap;
    }

    @Override
    public void edit() {

    }
}
