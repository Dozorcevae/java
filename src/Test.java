import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // ====== Создание объектов ======
        Library lib = new Library();
        University uni = new University();
        ShoppingCenter mall = new ShoppingCenter();
        House house = new House();
        HighRiseBuilding highrise = new HighRiseBuilding();
        PoliceDepartment pd = new PoliceDepartment();

        // ====== Базовые поля (помощник ниже) ======
        fillBase(lib,     "City Library",      "Lenina, 10",      1980, "—",   true);
        fillBase(uni,     "NSTU",              "Prospekt K., 20", 1950, "N/A", false);
        fillBase(mall,    "Mega Mall",         "Main St, 1",      2012, "F+P", false);
        fillBase(house,   "Private House",     "Elm St, 13",      2001, "—",   false);
        fillBase(highrise,"Sky Tower",         "Downtown, 10",    2019, "ZHA", false);
        fillBase(pd,      "Central Precinct",  "1 Justice Sq.",   1995, "—",   false);

        // ====== Специфичные настройки и вызовы ======
        // Library
        lib.setBooksCount(50_000);
        lib.setFreeMembership(true);
        lib.setReadingRooms(4);
        System.out.println(lib.hostReading("A. Pushkin"));
        lib.borrowBooks(120);
        lib.returnBooks(50);

        // University
        uni.setClassroomsCount(120);
        uni.setFounderName("State");
        uni.setStudentCount(14_000);
        uni.enrollStudents(300);
        uni.expelStudents(20);
        System.out.println(uni.scheduleLecture("Algorithms", 301));

        // ShoppingCenter
        mall.setFoodCourt(true);
        mall.setParkingSpaces(1_200);
        mall.setShopCount(180);
        mall.openShop();   // 181
        mall.closeShop();  // 180 обратно
        System.out.println("Parking available for 500 cars?  " + mall.canPark(500));
        System.out.println("Parking available for 1500 cars? " + mall.canPark(1500));

        // House (через методы класса)
        house.setBathroomsCount(2);
        house.setGasSupply(true);
        house.setResidents(3);
        house.moveIn(2);     // 5
        house.moveOut(1);    // 4
        house.toggleGas(false);

        // HighRiseBuilding
        highrise.setFloorCount(60);
        highrise.setHasElevator(true);
        highrise.setOccupiedFloors(45);
        System.out.println(highrise.callElevator(25));
        System.out.println(highrise.performFireDrill());
        System.out.println(highrise.openObservationDeck());

        // PoliceDepartment
        pd.setPrecinctName("Central-1");
        pd.setOfficers(350);
        pd.setOpenCases(120);
        pd.fileReport(); // 121
        System.out.println(pd.dispatchPatrol("Main & 3rd"));
        pd.closeCase();  // 120

        // ====== Демонстрация полиморфизма через интерфейсы ======
        List<SocialHouse> publicBuildings = new ArrayList<>();
        publicBuildings.add(lib);
        publicBuildings.add(uni);
        publicBuildings.add(mall);
        publicBuildings.add(highrise);
        publicBuildings.add(pd);

        for (SocialHouse s : publicBuildings) {
            s.openForPublic();
            System.out.println(s.getClass().getSimpleName() + " open? " + s.isOpenForPublic());
        }
        // Закроем библиотеку
        lib.closeForPublic();
        System.out.println("Library open? " + lib.isOpenForPublic());

        // LivingHouse — работаем через интерфейс
        LivingHouse living = house;
        living.moveIn(3);   // 4 -> 7
        living.moveOut(1);  // 7 -> 6
        System.out.println("Residents in house via LivingHouse: " + living.getResidents());

        // ====== Сводный вывод ======
        List<Building> all = List.of(lib, uni, mall, house, highrise, pd);
        System.out.println("\n=== STATE AFTER OPERATIONS ===");
        for (Building b : all) {
            System.out.println(b.getClass().getSimpleName() + ":");
            System.out.println("  " + b);
        }

        // ====== Простые проверки (java -ea TestInterfaces) ======
        assert lib.getBooksCount() == 50_000 - 120 + 50 : "Library books count mismatch";
        assert uni.getStudentCount() == 14_000 + 300 - 20 : "University students mismatch";
        assert mall.getShopCount() == 180 : "Shop count mismatch";
        assert house.getResidents() == 6 : "Residents mismatch after LivingHouse ops";
        assert highrise.hasElevator() : "Elevator should be present";
        assert pd.getOpenCases() == 120 : "Open cases mismatch";
        assert lib.isOpenForPublic() == false : "Library should be closed";
        for (int i = 1; i < publicBuildings.size(); i++) {
            assert publicBuildings.get(i).isOpenForPublic() : "Public building should be open: index " + i;
        }

        System.out.println("\nAll interface tests passed.");
    }

    private static void fillBase(Building b, String name, String address, int year,
                                 String architect, boolean isMonument) {
        b.setName(name);
        b.setAddress(address);
        b.setYearOfConstruction(year);
        b.setArchitect(architect);
        b.setCulturalMonument(isMonument);
    }
}
