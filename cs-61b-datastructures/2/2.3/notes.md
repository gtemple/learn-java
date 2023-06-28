### SLL and DLL
- Singly linked lists point in one direction, doubly linked lists point in both
- Instead of having 2 sentinels (one at each end), have just one that acts as both start and finish of list

- Generics will replace all instances of it in a class with that type

#### Arrays
- Numbered sequence of memory boxes
- Arrays have a fixed length in Java
- All items must be the same type
  y = new int[3]
  y = new int[3][3] //creates array of arrays
  y = new int[]{1, 2, 3}
- Assigning an array of strings creates STRING REFERENCES. The string itself is not placed in the array, only a reference to the string
- To copy an array use System.arraycopy

#### Arrays vs Classes
- Array indexies can be computed at runtime, class variables cannot
- 