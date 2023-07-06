
//this class only works in theory. Check SLList in folder 2
public class RotatingSLList<Item> extends SLList<Item> {
  public void rotateRight() {
  Item x = removeLast();
  addFirst(x);
  }
}
