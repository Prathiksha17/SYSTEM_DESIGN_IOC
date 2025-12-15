import java.util.List;

public class Main {
    public static void main(String[] args) {

        ParkingSpot s1 = new ParkingSpot("S1", VehicleType.CAR);
        ParkingSpot s2 = new ParkingSpot("S2", VehicleType.BIKE);

        ParkingFloor floor1 = new ParkingFloor(1, List.of(s1, s2));
        ParkingLotManager manager = new ParkingLotManager(List.of(floor1));

        EntryGate entryGate = new EntryGate(manager);
        ExitGate exitGate = new ExitGate();
        Payment payment = new Payment();

        Vehicle car = new Vehicle("KA-01-1234", VehicleType.CAR);

        Ticket ticket = entryGate.enter(car);
        System.out.println("Vehicle parked. Ticket ID: " + ticket.getTicketId());

        exitGate.exit(ticket, manager, payment);
    }
}
