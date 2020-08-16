package practice.idcard;

import practice.framework.*;

import java.util.*;

public class IDCardFactory extends Factory {
  private HashMap owners = new HashMap<String, Integer>();

  private Integer id = 100;

  protected Product createProduct(String owner) {
    return new IDCard(owner, id++);
  }

  protected void registerProduct(Product product) {
    IDCard ic = ((IDCard) product);
    owners.put(ic.getOwner(), ic.getId());
  }

  public HashMap getOwners() {
    return owners;
  }
}