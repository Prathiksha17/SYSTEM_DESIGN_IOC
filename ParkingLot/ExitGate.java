public class ExitGate {
    public void exit(Ticket ticket, ParkingLotManager manager, Payment payment) {
        long hours = ticket.getHoursParked();

        double amount =hours * 50;
        payment.makePayment(amount);
        manager.unParkVehicle(ticket);
        System.out.println("Vehicle exited. Ticket ID: " + ticket.getTicketId());
    }
}
