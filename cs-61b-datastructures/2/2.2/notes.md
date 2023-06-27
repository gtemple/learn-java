### Access Control
 - 'private' keyword stops you from being able to access variable from outside the class
 - If a private class never looks outwards, you can add static to it

##### Why?
- users don't need to know how class is implemented
- Safer for you to change

### SL Lists vs Int Lists:

- SL List has faster Size() method
- S List never sees IntList class
  - more efficient addFirst

### Sentinel Node
- first node that is always there

### Invariant
- condition that is guaranteed to be true during code exdcution

SL List:
  - sentenial reference always points to sentinel node
  - first node (if exists) is always at sentinel.next
  - size variable is always the total number of items that have been added