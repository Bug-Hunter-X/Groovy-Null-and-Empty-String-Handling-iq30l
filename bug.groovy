```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  } else if (str.isEmpty()) {
    return "Empty String"
  } else {
    return "Not Null or Empty"
  }
}

println myMethod(null)
println myMethod("")
println myMethod("Hello")
```