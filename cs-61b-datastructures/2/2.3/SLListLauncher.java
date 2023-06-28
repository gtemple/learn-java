public class SLListLauncher {
  public static void main(String[] args) {
    //the <> act as a generic.  
    SLList<String> s1 = new SLList<>("test");
    s1.addFirst("yo");
  }
}
