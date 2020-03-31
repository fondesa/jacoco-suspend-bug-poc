import kotlinx.coroutines.delay

suspend fun coveredFoo() {
    nestedFoo()
    println("This will be covered since the suspend function isn't the last invocation.")
}

suspend fun notCoveredFoo() {
    println("This won't be covered since the suspend function is the last invocation.")
    nestedFoo()
}

suspend fun nestedFoo() {
    delay(50L)
    println("Nested foo executed and always covered.")
}