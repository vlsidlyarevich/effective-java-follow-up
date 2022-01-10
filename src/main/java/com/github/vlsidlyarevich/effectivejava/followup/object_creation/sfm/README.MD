### Static factory method

---

* [Back to table of contents]()
* [Examples](Main.java)

---

Static factory methods are more preferable than usual constructors in some situations.

With static imports code can look very elegant and self-explorative.

<b>Pros:</b>
* Name can be specified
* Various constructors with same signature
* Returning new object is not a mandatory (good for high resource costs) 
* Subtypes can be returned

<b>Cons:</b> 
* Without java constructors there are no subtypes allowed
* Name should be selected precisely