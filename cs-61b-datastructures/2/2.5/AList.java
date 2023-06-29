public class AList {
  private int[] items;
  int size;

  public AList() {
    items = new int[100];
    size = 0;
  }

  public void addLast(int x) {
    items[size] = x;
    size = size + 1;
  }

  public int getLast() {
    return items[size - 1];
  }

  public int get(int t) {
    return items[i];
  }

  public int size() {
    return size;
  }

  public removeLast() {
    int x = getLast();
    size -= 1;
    return x;
  }
}
