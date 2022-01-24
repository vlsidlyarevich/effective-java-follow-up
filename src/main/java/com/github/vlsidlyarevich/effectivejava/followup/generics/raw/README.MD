### Avoid using raw types

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Raw types are unsafe and needed only for backward compatibility mechanisms.

If you need to declare somehow generic with unpredictable type - use wildcard ```<?>```
- it is more safe and compiler will protect you from mutations (except inserting nulls)

<b>There are 2 exceptions of this rule:</b>

* Type check 
```java 
  if (collection instanceof Set) {
  ```
* Class literals
```java
   List.class
  ```