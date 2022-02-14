### Use marker interfaces for type check

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)

---

Interface markers are suitable for situations when type check is preferable. 
Annotations should be used only when there is no possibility to achieve functionality via interfaces.

Advantages of marker interfaces:

* target could be prioritized (extend existing interface)
* compile time validation
* flexible api

You should use annotations when:

* the flow is mostly annotation-based
* marker is applicable anywhere
