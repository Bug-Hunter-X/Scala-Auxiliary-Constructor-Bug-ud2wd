# Scala Auxiliary Constructor Bug

This repository demonstrates a subtle bug in Scala related to how auxiliary constructors interact with primary constructors, especially when side effects are introduced into the primary constructor.

## The Bug
The primary constructor `MyClass(val x: Int)` initializes an instance variable `x`. The auxiliary constructor `this()` calls the primary constructor with `x = 0` as a default. This works as expected.
However, if you add side effects to the primary constructor, the behaviour of the auxiliary constructor becomes non-intuitive and could lead to unexpected results. 

## How to Reproduce
1. Clone this repository.
2. Compile and run `Main.scala`.
3. Observe the output. The output demonstrates the core functionality. Modifying the primary constructor may uncover the subtle bug.

## Solution
See the `MyClassSolution.scala` file for a potential solution illustrating safe approaches to handle auxiliary constructors. 

