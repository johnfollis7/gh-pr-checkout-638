// WITH_RUNTIME

fun bar(): Int = TODO()

fun foo(a: Iterable<Int>) {
    val b = listOf(1, bar(), 3)
    val c = a - <caret>b
}
