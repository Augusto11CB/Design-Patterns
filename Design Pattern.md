
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


## Structural Pattern

### Facade Pattern

The facade pattern does not add new functionalities, but it acts as a point of entry into complex subsystems.

This is done by encapsulating the subsystem classes into a Facade class, and then hiding them from the client classes so that the clients do not know about the details of the subsystem.

#### Facade Pattern Definitions
- Is a means to **hide the complexity** of a subsystem by **encapsulating** it behind a unifying wrapper called a facade class
- Removes the need for client classes to manage a subsystem on their own, resulting in less coupling between the subsystem and the client classes
- Handles instantiation and redirection of tasks to the appropriate class within the subsystem
- acts as a point of entry and **does not add** more functionality to the system.

**What are the key design principles are used to implement the facade design pattern?**
Encapsulation, information hiding, separation of concerns

### Adapter Pattern 
The adapter essentially encapsulates a class X (adaptee) and presents a new interface, or appearance, to a client class that have to use functionalities from the adaptee class and cannot interect with that directly. It does this by wrapping the adaptee’s interface and exposing a new target interface that makes sense to the client. 


**So, if two interfaces are incompatible, why don't we just change one or even both, so that they are able to talk to each other?**
Imagine that the adaptee classes area thirdy-party libraries that we may not have access to, but if we did have access to those libraries an update in their code could break the existing code in other parts in our system that also iteracts with those libraries.

#### Adapter Pattern Definitions
- wrap the adaptee and expose a target interface to the client.
- indirectly change the adptee's interface into one that the client is expecting by implementing a target interface
- translate the client's requesto in to one that is expected by the adaptee
- reuse adaptee with other client's that have incompatible interfaces

