### Override toString

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

You need to override toString **always**.

Default ```toString()``` is not informative at all.
Just use object's internal properties which are sensitive during debug or logging.