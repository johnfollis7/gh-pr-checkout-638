// WITH_RUNTIME

// should offer
val b = mutableListOf("a", "b", "c", "e")
fun <T : CharSequence> foo(a: Iterable<T>) {
    val c = a - <caret>b
}