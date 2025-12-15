import java.util.List;

public class ParkingLotManager {
    private final List<ParkingFloor> floors;

    public ParkingLotManager(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.findAvailableSpot(vehicle);
            if (spot != null) {
                spot.park(vehicle);
                return new Ticket(vehicle, spot);
            }
        }
        throw new RuntimeException("No parking spot available");
    }

    public void unParkVehicle(Ticket ticket) {
        ticket.getParkingSpot().removeVehicle();
    }
}
