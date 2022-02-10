### Use EnumSet instead bit maps

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

```java EnumSet``` contains lots of useful methods to work with enums.

Via this you can:

* read enums in range 
* combine enums
* complement enums
* select all values except specific ones

and even more. This is safe and productive abstraction and should be used anywhere if possible.