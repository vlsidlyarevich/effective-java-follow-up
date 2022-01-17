### Use composition over inheritance

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](MeowableQueue.java)

---

Choose composition in priority over the inheritance everywhere where it's possible.
Inheritance is fragile and unsafe to use and extend, it makes extension complicated and provides
additional risks in terms of backward compatibility.

<b>You should use inheritance only when:</b>
* Class is specifically aimed to be inherited, it is *well designed and documented*
* Inside small component when inheritance visibility could be reduced to minimum (for example package private class)
* The class has could be described as ```IS A``` another class, and this condition always true

On the other side, composition brings more flexibility, safety and easier to extend and support.
It helps to avoid following situations:

* You don't need to keep track on changes of super class
* You don't have to worry about method names and signatures
* The issues and errors of super's are don't propagating

