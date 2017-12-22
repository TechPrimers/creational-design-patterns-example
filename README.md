# Creational Design Patterns

## Singleton
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

## Builder
- Solves the multiple constructor problem (telescoping constructors)
- static inner class (builder class)
- internally required constructor
- removes the need for setters

### Disadvantages
- Immutable
- inner static class
- Designed first
- Complex
