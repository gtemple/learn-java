public class Maximizer {
    public static OurComparable max(OurComparable[] items) {
        int maxDex = 0;
        for (int i = 1; i < items.length; i += 1) { // Changed i=1 to start from the second item
            int cmp = items[i].compareTo(items[maxDex]);
            if (cmp > 0) {
                maxDex = i; // Changed 1 to i to update the correct index
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Jake", 3), new Dog("Alice", 9), new Dog("Alfred", 7)}; // Added semicolon at the end
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
    }
}