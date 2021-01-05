# design-patterns-with-solid-principles
A master guide to gang of four design patterns &amp; SOLID design principles using Java.
<p>
What are SOLID Design Principles?

These principles enable you to write most reusable & clean Java code in your projects.

<b>SOLID Principles</b> which are:

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
<b>Creational Design Patterns:</b> 

2.1 Simple Factory

2.2 Abstract Factory

2.3 Factory Method

2.4 Singleton : A component which is instantiated only once.
* Break the singleton through Serialization
* we could fix the obove issue by providing the readResolve property to the serializable object: protected Object resdResolve(){return INSTANCE;}, deserialization uses the reflection.
<p>The readResolve method is called when ObjectInputStream has read an object from the stream and is preparing to return it to the caller. ObjectInputStream checks whether the class of the object defines the readResolve method. If the method is defined, the readResolve method is called to allow the object in the stream to designate the object to be returned. The object returned should be of a type that is compatible with all uses. If it is not compatible, a ClassCastException will be thrown when the type mismatch is discovered.</p>

2.5 Builder: <b>what problem builder design patterns solve?</b>

* class constructor requires lot of information.
* In builder, we remove the logic related to object construction from "client" code & abstract it in to separate classes.
* ex. java.util.Calender.Builder
* compare & contrast with <b>Prototype</b>
* method chaining used in Builder pattern

2.6 <b>Prototype :</b>we have a complex object that is costly to create. To create more instances of such class, we use an existing instanse as our prototype. 

2.7 Object Pool

<b>Structural Design Patterns:</b> 

3.1 Object & Class Adapters

3.2 Decorator

3.3 Bridge

3.4 Facade

3.5 Static & Dynamic Proxy

3.6 Flyweight

3.7 Composite  

<b>Behavioral Design Patterns:</b>

4.1 Chain of Responsibility

4.2 Command

4.3 Interpreter

4.4 Mediator

4.5 Iterator

4.6 Memento

4.7 Observer

4.8 State

4.9 Strategy

4.10 Template Method

4.11 Visitor

4.12 Null Object
