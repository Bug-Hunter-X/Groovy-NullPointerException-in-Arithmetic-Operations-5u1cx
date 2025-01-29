```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // This line is problematic
  }
  return a + b
}

println myMethod(1,2) // Prints 3
println myMethod(null, 2) // Prints null
println myMethod(1, null) // Prints null
println myMethod(null, null) // Prints null
```