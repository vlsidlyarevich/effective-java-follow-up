### Use lists instead of arrays

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Always use lists instead of arrays.

Lists are *invariant*, whereas arrays are *covariant* - it means that for arrays notation like:
```java 
  Object[] arr = new String[1];
  ```
is correct from compiler perspective which can (and will) lead to execution time problems.