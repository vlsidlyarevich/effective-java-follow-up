### Use composition over inheritance

---

* [Back to table of contents]()

---



Advices: 
* Avoid mutators (setters, non-safe getters)
* Make class ```final``` *or* use hidden constructors and static factory methods
* All fields should be declared as ```final```
* Hide fields, use methods
* Be careful with links, use copies

Pros:
* Safety from concurrency perspective
* Always correct invariants
* Easy to build complex objects