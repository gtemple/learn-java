import java.util.Iterator;

public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public boolean contains(T x) {
        for (int i = 0; i < size; i++) {
            if (items[i] == null) {
                if (x == null) {
                    return true;
                }
            } else if (items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) { return true; }
      if (o instanceof ArraySet oas) {
        if (oas.size != this.size) {
          return false;
        }

        for (T x : this) {
          if (!oas.contains(x)) {
            return false;
          }
          return true;
        }
      }
      return false;
    }

    public void add(T x) {
        if (x == null) {
            throw new IllegalArgumentException("can't add null");
        }
        if (contains(x)) {
            return;
        }
        items[size] = x;
        size++;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T> {
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        @Override
        public boolean hasNext() {
            return wizPos < size;
        }

        @Override
        public T next() {
            T returnItem = items[wizPos];
            wizPos++;
            return returnItem;
        }
    }

    public static void main(String[] args) {
        ArraySet<Integer> s = new ArraySet<>();
        s.add(3);
        s.add(44);
        s.add(55);

        Iterator<Integer> aseer = s.iterator();

        while (aseer.hasNext()) {
            int i = aseer.next();
            System.out.println(i);
        }
    }
}