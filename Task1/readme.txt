
- What happens if the designers of the Storage class decide to change the implementation of the List to LinkedList?
  It will affect the internal data structure used for storing the elements in the list and will impact the specific methods available and the performance characteristics.

- Think about the method calls in main - does trimToSize() exist in LinkedList?
  The trimToSize() method calls in the Main class will result in compilation errors.
  This method is not available in the LinkedList class.

- Should Main know about what concrete type of List Storage provides?
No, Main dont need know about what concrete type of List Storage provides.
The best practice is to program against the more general List interface rather than assuming specific implementations.