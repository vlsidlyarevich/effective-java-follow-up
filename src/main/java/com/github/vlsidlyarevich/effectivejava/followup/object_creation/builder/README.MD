### Builder method

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Useful when 3+ params for object creation exist.
Building of difficult objects can be made in stages.

<b>Pros:</b>
* Object creation can be made in stages
* Object is always in consistent state

<b>Cons:</b> 
* Builder should be created first