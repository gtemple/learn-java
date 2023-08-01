public class Maximizer {
  public static OurComparable max(OurComparable[] items) {
    int maxDex = 0;
    for (int i = 0; i < items.length ; i += 1) {
      int cmp = items[i].compareTo(items[maxDex]);
      if (cmp > 0) {
        maxDex = 1;
      }
    }
    return items[maxDex];
  }
}

public static void main(String[] args) {
  Dog[] dogs = {new Dog("Jake", 3), new Dog("Alice", 9), new Dog("Alfred", 7)}
  Dog maxDog = (Dog) max(dogs);
  maxDog.bark();
}
