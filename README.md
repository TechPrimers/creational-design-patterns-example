# Creational Design Patterns
## Table of Contents
- [Singleton](#singleton)
- [Builder](#builder)
- [Factory](#factory)
- [AbstractFactory](#absfactory)

## Singleton <a name="singleton"></a>
- Static in nature
- Thread safe
- Private Constructor
- Private Instance of the Class
- No parameters to the Constructor

### Disadvantages
- Overusage
- Unit testing
- Slow down
- Confused with factory design pattern (with arguments)

## Builder <a name="builder"></a>
- Solves the multiple constructor problem (telescoping constructors)
- static inner class (builder class)
- internally required constructor
- removes the need for setters

### Disadvantages
- Immutable
- inner static class
- Designed first
- Complex

## Factory <a name="factory"></a>
- Doesn't expose instantiation or the creation logic
- Subclasses create the objects
- Common Abstract/Interface
- Framework, the client/ the implementation uses the factories

### Disadvantages
- Complex
- Creation in Subclasses
- Refactoring

## Abstract Factory <a name="absfactory"></a>
- Factory of factories/ related object / colelctions of factories
- Common Abstract/Interface
- Subclasses create the objects

### Disadvantages
- The code is complex
- Refactoring factory
- More control to client

