// HouseKeeping.java
public class HouseKeeping implements HotelService {
    @Override
    public void performService() {
        System.out.println("Housekeeping service in progress...");
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room number: " + roomNumber);
    }
}
