package sample;

import sample.framework.*;
import sample.idcard.*;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("one");
    Product card2 = factory.create("two");
    Product card3 = factory.create("three");

    card1.use();
    card2.use();
    card3.use();
  }
}