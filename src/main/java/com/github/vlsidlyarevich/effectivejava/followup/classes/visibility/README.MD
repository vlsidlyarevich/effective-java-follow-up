### Make class visibility as less as possible

---

* [Back to table of contents]()
* [Examples](Main.java)

---

Classes should be designed to expose as less public API as possible. Also avoid using public fields.
In case you need to declare public field as a part of design it should be **immutable and static final**

Advices:
* *private* > *package-private* > *protected* > *public* 
* public fields - ```static final``` and immutable only
* if public field is mutable - make copy or return unmodifiable version via another field like:
```java
    private static final Stuff[] SECRET_STUFF = { ... };
    //unmodifiable list
    public static final List<Stuff> PUBLIC_STUFF = List.of(SECRET_STUFF);
```