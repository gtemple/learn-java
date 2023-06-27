public class SList {

  private static class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n) {
      item = i;
      next = n;
    }
  }

  // the first item (it it exists) is at sentinel.next
  public IntNode sentinel;
  private int size;

  public SList() {
    sentinel = new IntNode(1, null);
    size = 0;
  }

  public SList(int x) {
    sentinel = new IntNode(63, null);
    sentinel.next = new IntNode(x, null);
    size = 1;
  }

  public void addFirst(int x) {
    sentinel.next = new IntNode(x, sentinel.next);
    size +=1;
  }

  public int getFirst() {
    return sentinel.next.item;
  }

  public void addLast(int x) {
    size += 1;

    IntNode p = sentinel;

    while (p.next != null) {
      p = p.next;
    }

    p.next = new IntNode(x, null);
  }

  // private static int size(IntNode p) {
  //   if (p.next == null) {
  //     return 1;
  //   }
  //   return 1 + size(p.next);
  // }

  public int size() {
    return size;
  }

  public static void main(String[] args) {
    SList L = new SList();
    L.addFirst(2);
    L.addFirst(4);
    L.addLast(9);
    System.out.println(L.getFirst());
  }

}
