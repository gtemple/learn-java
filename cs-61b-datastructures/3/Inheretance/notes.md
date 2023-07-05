- overloading: multiple methods with the same name but different signatures
- overriding: a subclass overrides the method of a superclass
  - overriding is also great for managing typos (you will get an error if you use @override but are not overriding anything)

- interface inheritance: inherits signature but not code implementation
- implementation inheritance: inherets signature AND implementation
  - you can add new methods to the interface using the keyword 'default'


- Every variable has:
  1. A compile-time type (static type): Type specified at declaration and never changes.
  2. A run-time type (dynamic type): specified aat instantion (when using new)
