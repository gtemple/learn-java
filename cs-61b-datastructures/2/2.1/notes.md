### Variables in Java
- int is always 32 bytes
- double is always 64 bytes
- these bytes are put into 'boxes' that are then referenced by the variable name

### Primitive Types
#### Golden Rule of Equals
- when assigning a variable, the assignment copies all of the bytes from the assignee
  ex: y = x ... copies all the bits from x into y
- Applies to paramater passing too

### Reference Types
- Self explanatory... is a reference
- Can be thought of as an 'address' referencing where in the memory the bits have been stored
- With reference types you are storing the address of the box, not a new box