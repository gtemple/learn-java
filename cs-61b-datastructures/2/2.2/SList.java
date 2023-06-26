public class SList {

  private static class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n) {
      item = i;
      next = n;
    }
  }

  public IntNode first;

  public SList(int x) {
    first = new IntNode(x, null);
  }

  public void addFirst(int x) {
    //adds x to the front of the list
    first = new IntNode(x, first);
  }

  public int getFirst() {
    return first.item;
  }

  public void addLast(int x) {
    IntNode p = first;

    while (p.next != null) {
      p = p.next;
    }

    p.next = new IntNode(x, null);
  }

  public static void main(String[] args) {
    SList L = new SList(10);
    L.addFirst(2);
    L.addFirst(4);
    L.addLast(9);
    System.out.println(L.getFirst());
  }

}
