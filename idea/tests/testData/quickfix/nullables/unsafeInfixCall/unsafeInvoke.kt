// "Replace with safe (?.) call" "true"

fun foo(exec: (() -> Unit)?) = exec<caret>()

/* IGNORE_FIR */
