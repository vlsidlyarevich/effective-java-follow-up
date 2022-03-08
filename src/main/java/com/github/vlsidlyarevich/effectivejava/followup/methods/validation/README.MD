### Validate input params

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Validate public method params because:

- it would make programs fail-fast if needed
- you will ensure params correctness
- it will speed-up calculations

For private libs ```assert``` could be used. It will throw ```java java.lang.AssertionError``` and could be used as listed in example 
below. It can be enabled via vm ```-ea``` or ```-enableassertions``` flag.

Also remember java 7+ methods for easier validation:
- ```Objects.isNull```
- ```Objects.nonNull```
- ```Objects.requireNonNull```
- ```Objects.requireNonNullElse```
- ```Objects.requireNonNullElseGet```
- ```Objects.checkIndex```
- ```Objects.checkFromToIndex```
- ```Objects.checkFromIndexSize```
