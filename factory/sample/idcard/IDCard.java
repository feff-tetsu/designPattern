package sample.idcard;

import sample.framework.*;

public class IDCard extends Product {
  private String owner;

  IDCard(String owner) {
    System.out.println(owner + "のカードを作ります。");
    this.owner = owner;
  }

  public void use() {
    System.out.println(owner + "のカードを使用します。");
  }

  public String getOwner() {
    return owner;
  }
}