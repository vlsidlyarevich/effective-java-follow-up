### Be careful with clone

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Clone is not so trivial and should be used carefully.
```Cloneable``` interface marks class as a class with fully functional ```clone()``` method.

Which means that:

- all subclasses should follow this contract too 
- it creates objects without constructor: dangerous practice
- cloned object should be independent from it's parent: all complex fields like collections, custom classes etc. should 
be cloned and dereferenced from original object
- immutable objects should never override ```clone```
- ```Cloneable``` is not compatible with ```final``` fields


**Better alternatives**
* Use Factory pattern
* Use static factory method 
* Use copy constructor