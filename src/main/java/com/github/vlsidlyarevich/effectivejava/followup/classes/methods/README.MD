### Use access methods instead of public fields

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Avoid accessing fields directly, use access methods instead.
It makes code more safe, easier to refactor and can be improved further to better design.

Classic getters and setters are **much better** than just fields, but **they are not perfect** anyway.