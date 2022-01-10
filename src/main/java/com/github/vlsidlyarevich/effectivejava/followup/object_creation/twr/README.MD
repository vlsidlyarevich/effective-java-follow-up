### Use try-with-resources 

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Use try-with-resources everywhere if possible.

Sometimes developers can forget to close resources, despite the fact that some of them has their own finalizers - 
we can't rely on them.

<b>Pros:</b>
* Easy and safe resources handling
* Less code, more verbose

<b>Cons:</b> 
* Sometimes can't be used
* Hard to find errors if multiple root causes