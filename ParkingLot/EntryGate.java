public class EntryGate {
    private final ParkingLotManager parkingLotManager;

    public EntryGate(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }

    public Ticket enter(Vehicle vehicle) {
        return parkingLotManager.parkVehicle(vehicle);
    }
}
