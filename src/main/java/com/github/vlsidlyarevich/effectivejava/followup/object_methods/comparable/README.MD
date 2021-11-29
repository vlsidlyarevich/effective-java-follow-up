### Use Comparable

---

* [Back to table of contents]()
* [Examples](Main.java)

---

Comparable interface is useful when you need:

- provide easy ordering and sorting mechs like ```Arrays.sort()```  
- use binary and other searches
- using in ```SortedMap``` and ```SortedSet``` without any additionals

But it has it's own contract which is kinda similar to ```equals()```:

**Tips and tricks**
* ```Objects.hash(x, y, z...)``` can be used when speed is not so important
* hash could be stored inside object if speed is crucial