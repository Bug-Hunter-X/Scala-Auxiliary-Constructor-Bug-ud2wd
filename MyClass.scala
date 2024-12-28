```scala
class MyClass(val x: Int) {
  def this() { this(0) }
}

object Main extends App {
  val instance1 = new MyClass(5)
  val instance2 = new MyClass()
  println(instance1.x) // Output: 5
  println(instance2.x) // Output: 0

  // The bug is related to the way the auxiliary constructor calls the primary constructor.
  // If the primary constructor is changed, unexpected behavior could happen.
  // Example: adding a side effect to the primary constructor 
}
```