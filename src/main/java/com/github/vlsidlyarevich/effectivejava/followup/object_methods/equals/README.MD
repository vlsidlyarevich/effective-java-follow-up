### Override equals propperly

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

You need to override equals properly.

Equals can be used for:

* comparing objects used as collection keys
* value objects inside collections
* superclass has not overrided equals

Equals method implementation should follow next equivalency class rules:

- for any non-nullable object ```x.equals(x)``` should return ```true```
- for any non-nullable objects ```x``` and ```y``` ```x.equals(y)``` should return ```true``` only if ```y.equals(x)```
- for any non-nullable objects ```x```, ```y``` and ```z``` if ```x.equals(y)``` returns ```true```
  and ```y.equals(z)```
  then ```x.equals(z)``` should be ```true```
- for any non-nullable objects ```x``` and ```y``` result of ```x.equals(y)``` should be the same if data were not
  changed
- for any non-nullable object ```x``` ```x.equals(null)``` should return ```false```
