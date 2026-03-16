class BookMyStayApp{

    public static void main(String[] args){
        System.out.println("Welcome to hostel booking management system");
        System.out.println("System initialized successfully.");

//        UC2 - Basic Room Types & Static Availability
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suiteRoom = new SuiteRoom();

        System.out.println("Double Room Details:");
        doubleRoom.displayRoomDetails();

        System.out.println("Suite Room Details:");
        suiteRoom.displayRoomDetails();
    }
}