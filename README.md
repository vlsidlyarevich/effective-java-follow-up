# Effective Java follow-up

This is not a copyright, just my abstract of "Effective java 3rd edition"
written by [Joshua Bloch](https://twitter.com/joshbloch). I've tried to memorize the most attractive things for me, and
write some examples with easy navigation for future usages.

Please, read book first!=)

## Сontent

--- 

### [Object creation/destruction](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_creation)

**Examples:**

* [Use static factory method if needed](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_creation/sfm/README.MD)
* [Use builder when multiple params](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_creation/builder/README.MD)
* [Use try-with-resources instead of try-finally](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_creation/twr/README.MD)

**Advices:**

- Create and fetch singletons by private constructor or enum
- Use private constructor for non-creatable objects
- Use DI everywhere
- Avoid extra Object creation
- Avoid old object links
- Avoid finalizers and cleaners

### [Objects common methods](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods)

**Examples:**

* [Override equals() properly](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/equals/README.MD)
* [Override hashcode() properly](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/hashcode/README.MD)
* [Always override toString()](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/to_string/README.MD)
* [Be careful with clone()](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/clone/README.MD)
* [Use Comparable](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/object_methods/comparable/README.MD)

### [Classes and interfaces](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes)

**Examples:**

* [Make class visibility as less as possible](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes/visibility/README.MD)
* [Use access methods](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes/methods/README.MD)
* [Design immutable classes](/tree/main/src/main/java/com/github/vlsidlyarevich/effectivejava/followup/classes/immutability/README.MD)

**Advices:**



---

## Authors

**Vladislav Sidlyarevich** - [Github profile](https://github.com/vlsidlyarevich)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details