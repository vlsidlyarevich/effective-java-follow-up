### Always use @SafeVarargs

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Use ```@SafeVarargs``` everywhere, because you need to design varargs correctly because they 
can lead to heap pollution, compiler issues and runtime errors.

You should avoid such things as:

- Mutating the value of incoming vararg
- Returning incoming vararg (visibility for other code) like:
```java
public <T> T[] toArray(T... args) {
        return args;
}
```