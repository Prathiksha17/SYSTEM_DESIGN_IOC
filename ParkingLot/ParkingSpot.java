public class ParkingSpot {
    private final String spotId;
    private final VehicleType supportedType;
    private Vehicle parkedVehicle;

    public ParkingSpot(String spotId, VehicleType supportedType) {
        this.spotId = spotId;
        this.supportedType = supportedType;
    }

    public boolean isFree() {
        return parkedVehicle == null;
    }

    public boolean canFit(Vehicle vehicle) {
        return isFree() && vehicle.getType() == supportedType;
    }

    public void park(Vehicle vehicle) {
        if (!canFit(vehicle)) {
            throw new RuntimeException("Vehicle cannot fit in this spot");
        }
        this.parkedVehicle = vehicle;
    }

    public void removeVehicle() {
        this.parkedVehicle = null;
    }

    public String getSpotId() {
        return spotId;
    }
}
