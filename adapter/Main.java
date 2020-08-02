import java.io.*;

public class Main {
  public static void main(final String[] args) {
    FileIO f = new FileProperties();
    try {
      f.readFromFile("file.txt");
      f.setValue("year", "2004");
      f.setValue("month", "4");
      f.setValue("day", "21");
      System.out.println(f.getValue("year"));
      System.out.println(f.getValue("month"));
      System.out.println(f.getValue("day"));
      f.writeToFile("newFile.txt");
    } catch (final IOException e) {
      e.printStackTrace();
    }
  }
}