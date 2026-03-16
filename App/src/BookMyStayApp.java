class BookMyStayApp {

    public static void main(String[] args){

        System.out.println("Welcome to hostel booking management system");
        System.out.println("System initialized successfully.");

        // UC2 - Basic Room Types & Static Availability
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suiteRoom = new SuiteRoom();

        System.out.println("Double Room Details:");
        doubleRoom.displayRoomDetails();

        System.out.println("Suite Room Details:");
        suiteRoom.displayRoomDetails();


        // UC3 - Centralized Room Inventory Management
        RoomInventory inventory = new RoomInventory();

        Room doubleRoomInv = new DoubleRoom();
        Room suiteRoomInv = new SuiteRoom();

        System.out.println("Hotel Room Inventory Status\n");

        System.out.println("Double Room:");
        doubleRoomInv.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Double Room"));
        System.out.println();

        System.out.println("Suite Room:");
        suiteRoomInv.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Suite Room"));

        // UC4 - Room Search & Availability Check
        RoomSearchService searchService = new RoomSearchService();

        searchService.searchAvailableRooms(
                inventory,
                doubleRoomInv,
                suiteRoomInv
        );
    }
}