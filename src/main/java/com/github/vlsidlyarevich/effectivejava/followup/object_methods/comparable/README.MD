### Use Comparable

---

* [Back to table of contents](https://github.com/vlsidlyarevich/effective-java-follow-up)
* [Examples](Main.java)

---

Comparable interface is useful when you need:

- provide easy ordering and sorting mechs like ```Arrays.sort()```  
- use binary and other searches
- using in ```SortedMap``` and ```SortedSet``` without any additionals

It has it's own contract which is kinda similar to ```equals()```:

- ```x.compareTo(y) == -x.compareTo(x)``` for each ```x``` and ```y``` 
- transitivity: ```x.compareTo(y) > 0 && y.compareTo(z) > 0``` then ```x.compareTo(z) > 0```
- ```x.compareTo(y) == 0 && y.compareTo(z) == 0``` then ```x.compareTo(z) == 0```
- *it is recommended* that ```(x.compareTo(y) == 0) == (x.equals(y))```

**Tips and tricks**
- Avoid ```< >```, use ```compare``` instead
- Use nested comparators