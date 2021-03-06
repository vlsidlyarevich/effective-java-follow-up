### Design immutable classes

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](ImmutableCat.java)

---

<b>Advices:</b>
* Avoid mutators (setters, non-safe getters)
* Make class ```final``` *or* use hidden constructors and static factory methods
* All fields should be declared as ```final```
* Hide fields, use methods
* Be careful with links, use copies

<b>Pros:</b>
* Safety from concurrency perspective
* Always correct invariants
* Easy to build complex objects