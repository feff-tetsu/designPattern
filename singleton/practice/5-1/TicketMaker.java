public class TicketMaker {
  private static TicketMaker ticketMaker = new TicketMaker();

  private int ticket = 0;

  private TicketMaker() {
    System.out.println("constractor");
  }

  public int getNextTicketNumber() {
    return ticket++;
  }

  public static TicketMaker getInstance() {
    return ticketMaker;
  }
}