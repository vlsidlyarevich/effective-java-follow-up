### Use EnumMap

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

```java EnumMap``` is fast ```Map``` realization to work with enum as a key.

If you want to group objects into collections by their attribute which is enum - 
use ```EnumMap```.

Note that using streams will not guarantee ```EnumMap``` utilization, you need to specify collection 
type manually to achieve highest performance (it is viable in difficult scenarios).

For example:
```java
cats.stream().collect(groupingBy(Kitten::getBirthdayMonth));
```

Should be replaced with:
```java
cats.stream().collect(groupingBy(Kitten::getBirthdayMonth, () -> new EnumMap<>(Month.class), toSet()));
```