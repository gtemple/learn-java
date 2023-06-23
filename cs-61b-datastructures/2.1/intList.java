public class IntList {
  public int first;
  public IntList rest;

  public void IntList(int f, IntList r) {
    first = f;
    rest = r;
  }
  // recursion 
  public int size() {
    if (rest == null) {
      return 1;
    }
    return 1 + this.rest.size();
  }

  public int iterativeSize() {
    IntList p = this;
    int totalSize = 0;
    while (p != null) {
      totalSize += 1;
      p = p.rest;
    }
    return totalSize;
  }

  public static void main(String[] args) {
    IntList L = new IntList();
    L.first = 5;
    L.rest = null;

    L.rest = new IntList();
    L.rest.first = 10;

    L.rest.rest = new IntList();
    L.rest.rest.first = 15;

    System.out.println(L.size());
    System.out.println(L.iterativeSize());

  }
}
