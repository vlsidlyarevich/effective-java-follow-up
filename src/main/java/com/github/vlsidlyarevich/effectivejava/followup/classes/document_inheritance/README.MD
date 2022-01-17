### Document classes aimed for extension

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)

---

If you decided to use extension you should be sure that it is well documented and follows points like:
* All usages of overridable methods are documented
* Constructors, ```clone```, ```readObject``` should never call overridable methods 
* Some useful methods could be provided for subclasses
