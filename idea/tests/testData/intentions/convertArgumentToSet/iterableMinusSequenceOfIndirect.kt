// WITH_RUNTIME
// IS_APPLICABLE: false

fun <T : CharSequence> foo(a: Iterable<T>) {
    val b = sequenceOf("a", "b", "c", "e")
    val c = a - <caret>b
}
