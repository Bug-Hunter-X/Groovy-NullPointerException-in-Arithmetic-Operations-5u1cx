```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Return 0 instead of null
  }
  return a + b
}

println myMethod(1,2) // Prints 3
println myMethod(null, 2) // Prints 2
println myMethod(1, null) // Prints 1
println myMethod(null, null) // Prints 0
```