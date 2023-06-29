public class AList<Item> {
  private Item[] items;
  int size;

  public AList() {
    items = (Item[]) new Object[100];
    size = 0;
  }

  private void resize(Item capacity) {
      Item[] a = (Item[]) new Object[capacity];
      System.arraycopy(items, 0, a, 0, size);
      items = a;
  }

  public void addLast(Item x) {
    if (size == items.length) {
      resize(size + 1);
    }

    items[size] = x;
    size = size + 1;
  }

  public Item getLast() {
    return items[size - 1];
  }

  public Item get(int t) {
    return items[i];
  }

  public int size() {
    return size;
  }

  public removeLast() {
    Item x = getLast();
    size -= 1;
    return x;
  }
}
