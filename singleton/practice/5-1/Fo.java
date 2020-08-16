public class Fo {
  public static void main(String args[]) {
    TicketMaker ticketMaker = TicketMaker.getInstance();
    TicketMaker ticketMaker2 = TicketMaker.getInstance();

    System.out.println((ticketMaker == ticketMaker2));
    for (int i = 0; i < 10; i++) {
      System.out.println(ticketMaker.getNextTicketNumber());
    }
  }
}