package practice.idcard;

import practice.framework.*;

public class IDCard extends Product {
  private String owner;
  private Integer id;

  IDCard(String owner, Integer id) {
    System.out.println("ID:" + id + " " + owner + "のカードを作ります。");
    this.owner = owner;
    this.id = id;
  }

  public void use() {
    System.out.println("ID:" + id + " " + owner + "のカードを使用します。");
  }

  public String getOwner() {
    return owner;
  }

  public Integer getId() {
    return id;
  }
}