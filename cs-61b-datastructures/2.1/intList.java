public class intList {
  public int first;
  public IntList rest;

  public IntList(int f, IntList r) {
    first = f;
    rest = r;
  }

  public static void main(String[] args) {
    IntList L = new intList();
    L.first = 5;
    L.rest = null;

    L.rest = new IntList();
    L.rest.first = 10;

    L.rest.rest = newIntList();
    L.rest.rest.first = 15;
  }
}
