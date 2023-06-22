public class Dog {
  public int size;

  public static void makeNoise() {
    System.out.println("bark");
  }

  public void main(String[] args) {
    if (size > 10) {
      System.out.println("yap");
    } else {
      System.out.println("aroo");
    }
  }
}
