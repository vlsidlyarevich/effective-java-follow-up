# Effective Java follow-up

This is not a copyright, just my abstract of "Effective java 3rd edition"
written by [Joshua Bloch](https://twitter.com/joshbloch). I've tried to memorize the most attractive things for me, and
write some examples with easy navigation for future usages.

Please, read book first!=)

## Сontent

--- 
### [Object creation/destruction](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_creation)

**Examples:**

* [Use static factory method if needed](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_creation/sfm/README.MD)
* [Use builder when multiple params](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_creation/builder/README.MD)
* [Use try-with-resources instead of try-finally](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_creation/twr/README.MD)

**Advices:**

- Create and fetch singletons by private constructor or enum
- Use private constructor for non-creatable objects
- Use DI everywhere
- Avoid extra Object creation
- Avoid old object links
- Avoid finalizers and cleaners

### [Objects common methods](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods)

**Examples:**

* [Override equals() properly](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/equals/README.MD)
* [Override hashcode() properly](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/hashcode/README.MD)
* [Always override toString()](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/to_string/README.MD)
* [Be careful with clone()](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/clone/README.MD)
* [Use Comparable](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/comparable/README.MD)

### [Classes and interfaces](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes)

**Examples:**

* [Make class visibility as less as possible](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes/visibility/README.MD)
* [Use access methods](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes/methods/README.MD)
* [Design immutable classes](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes/immutability/README.MD)
* [Use composition over inheritance](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes/composition/README.MD)
* [Use documented classes when inheritance needed](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes/documented_inheritance/README.MD)

**Advices:**

- Use interfaces instead abstract classes
- Use default methods for backward compatibility
- Use interfaces for creation types only (don't use as constant holders etc.)
- Use class hierarchy over descriptor classes
- Use static inner classes instead of non-static ones
- Always have 1 top-level class in file

### [Generics](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/generics)

**Examples:**

* [Avoid Raw types](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/generics/raw/README.MD)
* [Fix all compiler issues](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/generics/notifications/README.MD)
* [Use lists instead of arrays](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/generics/arrays/README.MD)
* [Always use @SafeVarargs](src/main/java/com/github/vlsidlyarevich/effectivejava/followup/generics/varargs/README.MD)

**Advices:**

- Generics are better than class cast
- Generic methods are useful and better than class cast
- Remember **PECS** - producer extends, consumer super


---

## Authors

**Vladislav Sidlyarevich** - [Github profile](https://github.com/vlsidlyarevich)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details