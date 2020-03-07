
# Design Patterns

Generally speaking, there are three main categories of Design Patterns. They are:
  - Creational Patterns
  - Structural Patterns - 
 Use structural patterns to describe how different objects have a relationship (how they interact with each other). Also, how they should work to achieve a particular goal (how spicy and ingredients work to create a dish)
  - Behavioral Patterns -
It defines how objects distribute work, how an object performs a single cohesive function and how different/independent objects work towards a common goal. (Race team trying to win the race).

## Creational Pattern
### Singleton

### Factory Method Pattern
The Factory Method Pattern encapsulates object creation by letting subclasses decide what objects to create.

* What is a factory?
Generally, a factory is a method or an object that creates other objects.

Factories allow the client code operates on generalization. It is called coding to an interface.e to

**Benefits of Factory Objects**
If there are multiple clients that want to instantiate the same set of classes, then by using the Factory Method pattern we cut out the redundancy of code and made the code easier to modify (add more type of classes that can be instantiated)

**Factory Object vs Factory Method Pattern**
In factory method pattern, the creation of an object is separated in a different method. Instead of working with factory objects we specialize the class that uses the factory method 

**Creator Classes and Product Classes**

In the creator classes there is an abstract method that the subclasses implement to produce Products. 
(Often the creator class has code that depends on an abstract product which is produced by the subclass)

**Summarisation**
By placing all my creation code in one object or method, It avoids duplication in the code and provide one place to perform maintenance. That also means clients depend only upon interfaces rather than the concrete classes required to instantiate objects. Moreover, this allows me to program to an interface, not an implementation, and that makes my code more flexible and extensible in the future.
# Todo - put the printscreen 

## Facade Pattern

The facade pattern does not add new functionalities, but it acts as a point of entry into the subsystems.
