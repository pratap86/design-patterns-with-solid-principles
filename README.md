# Design Patterns with Solid Principles

A master guide to gang of four design patterns &amp; SOLID design principles using Java.
<p>
What are SOLID Design Principles?

These principles enable you to write most reusable & clean Java code in your projects.

### SOLID Principles which are:

1.1 Single Responsibility Principle - There should never be more than one reason for a class to change.

1.2 Open-Closed Principle - Software entities(classes, modules, methods etc) should be open for extension, but closed for modification.

<b>Open for Extension -> Extends existing behaviour

Closed for Modification -> Existing code remains unchanged</b>

1.3 Liskov Substitution Principle - We should be to substitute base class object with child class objects & this should not alter the behaviour/characterirstics of program. 

1.4 Interface Segregation Principle - Clients should not be forced to depend upon Interfaces that they do not use(Interface Pollution).

<b>write highly cohesive interfaces</b>

1.5 Dependency Inversion Principle

<p>A. High level modules should not depend on low level modules, both should depend on Abstractions.</p>
<p>B. Abstractions should not depend upon details, details should depend upon abstraction.</p>
</p>

### Creational Design Patterns

2.1 Simple Factory

2.2 Abstract Factory

2.3 Factory Method

2.4 Singleton : A component which is instantiated only once.
* Break the singleton through Serialization
* we could fix the obove issue by providing the readResolve property to the serializable object: 

```ruby
protected Object readResolve(){
  return INSTANCE;
} 
```
* deserialization uses the reflection.
<p>The readResolve method is called when ObjectInputStream has read an object from the stream and is preparing to return it to the caller. ObjectInputStream checks whether the class of the object defines the readResolve method. If the method is defined, the readResolve method is called to allow the object in the stream to designate the object to be returned. The object returned should be of a type that is compatible with all uses. If it is not compatible, a ClassCastException will be thrown when the type mismatch is discovered.</p>

2.5 Builder: <b>what problem builder design patterns solve?</b>

* class constructor requires lot of information.
* In builder, we remove the logic related to object construction from "client" code & abstract it in to separate classes.
* ex. java.util.Calender.Builder
* compare & contrast with <b>Prototype</b>
* method chaining used in Builder pattern

2.6 <b>Prototype :</b>we have a complex object that is costly to create. To create more instances of such class, we use an existing instanse as our prototype. 

2.7 Object Pool

### Structural Design Patterns 

#### ObjectAdapter & Class Adapter(What is Adapter?)

  - We have an existing object which provides the functionality that client needs. But client code can't use this object because it expects an object with different interface.
  - Using Adapter design pattern we make this existing object work with client by adapting the object to client's expected interface.
  - Adapter aka Wrapper as it "wraps" existing object.
  - use Inheritance & composition to implement Adapter
  - Examples;
    - java.io.InputStreamReader & java.io.OutputStreamWriter
    - These classes adapt existing InputStream/OutputStream object to a Reader/Writer interface.

#### Decorator

  - When we want to enhance behaviour of our existing object dynamically as and when required then we can use decorator design pattern.
  - Decorator wraps an object within itself and provides same interface as the wrapped object. So the client of original object dosen't need to change.
  - A decorator provides alternative to subclassing for extending functionality of existing classes.
  - Support recursive composition
  - Decorators are more flexible & powerful than inheritance. Inheritance is static by definition but decorators allow you to dynamically compose behaviour using object at runtime.
  - Examples : Classes in Java's I/O packages are great example of decorator pattern.
    - java.io.BufferedOutputStream class decorates any java.io.OutputStream object and add buffering to file writing operation. This improves the disk i/o performance by reducing the number of writes.

```ruby
try(OutputStream os = new BuffuredOutputStream("xyz.txt"))){
  os.write('x');
  os.flush();
}
```
    

#### Bridge

#### Facade
  - use when working with legacy system
  - Client has to intract with a large number of interfaces & classes in a subsystem to get result. So client gets tightly coupled with those interfaces & classes. Facade solve this problems.
  - Facade provides a simple & unified interface to a subsystem. Cleint interacts with just the facade now to get the same result.
  - Facade is not just a one to one method forwarding to other classes.
  - The java.net.URL class is a great example of facade. This class provides a simple method called as openStream() & we get an input stream to the resource pointed at by the URL object. 

#### Proxy Design Pattern
  - What is a Proxy?
    - we need to provide a placeholder or surrogate to another object
    - Proxy acts on behalf of the object and is used for lots of reasons some of the main reasons are;
      - Protection Proxy - Control access to original object's operations
      - Remote Proxy - Provides a local representation of a remote object
      - Virtual Proxy - Delay construction of original object until obsolutely necessary
    - Cleint is unaware of existance of proxy. Proxy performs its work transparently.
    - Proxy Examples;
      - Lazy loading of collections by Hibernate
      - APO based method level security
      - RMI/web service stubs 
#### Flyweight

#### Composite  

<b>Behavioral Design Patterns:</b>

#### Chain of Responsibility

#### Command

#### Interpreter

#### Mediator

#### Iterator

#### Memento

#### Observer

#### State

#### Strategy

#### Template Method

#### Visitor

#### Null Object
