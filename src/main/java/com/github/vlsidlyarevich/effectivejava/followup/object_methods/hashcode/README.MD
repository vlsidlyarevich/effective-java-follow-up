### Override hashcode propperly

---

* [Back to table of contents]()
* [Examples](Main.java)

---

You need to override hashcode in case of equals override properly.

Hashcode method implementation should follow next rules:

- for any non-nullable and unchanged object ```x.hashCode()``` should return same value every time 
- for any non-nullable objects ```x``` and ```y``` if ```x.equals(y)``` then ```x.hashCode()``` should be equal to ```y.hashCode()```
