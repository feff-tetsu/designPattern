public class Triple {
  private static Triple[] triples = new Triple[] { new Triple(0), new Triple(1), new Triple(2) };

  private int id = 0;

  private Triple(final int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public static Triple getInstance(final int id) {
    return triples[id];
  }
}