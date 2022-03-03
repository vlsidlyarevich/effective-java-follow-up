### Use parallel streams carefully

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Using ```parallel()``` can dramatically slow down your algorithm. Try to avoid using of this, 
because there are not many places where it will bring huge benefit.

Suitable sources for parallelisation:
- ArrayList
- HashMap
- HashSet
- ConcurrentHashMap
- Arrays
- Ranges

You should test your parallelization to be sure that it would not bring errors, leaks or slow down.