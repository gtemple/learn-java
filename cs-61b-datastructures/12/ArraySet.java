public class ArraySet<T> {
  private T[] items;
  private int size;

  @SuppressWarnings("unchecked")
  public ArraySet() {
    items = (T[]) new Object[100];
    size = 0;
  }

  public boolean contains(T x) {
    for (int i = 0; i < size; i += 1) {
      if (items[i].equals(x)) {
        return true;
      }
    }
    return false; // Moved outside of the loop
  }

  public void add(T x) {
    if (x == null) {
      throw new IllegalArgumentException("can't add null");
    }
    if (contains(x)) {
      return;
    }
    items[size] = x;
    size += 1;
  }
}
