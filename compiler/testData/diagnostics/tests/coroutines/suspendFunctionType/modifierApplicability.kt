typealias Action = () -> Unit

interface SAM {
    fun run()
}

typealias Test1 = suspend () -> Unit
typealias Test2 = suspend Int.() -> Unit
typealias Test3 = <!WRONG_MODIFIER_TARGET!>suspend<!> Function0<Unit>
typealias Test4 = <!WRONG_MODIFIER_TARGET!>suspend<!> Action
typealias Test5 = List<suspend () -> Unit>
typealias Test6 = <!WRONG_MODIFIER_TARGET!>suspend<!> List<() -> Unit>
typealias Test7 = <!WRONG_MODIFIER_TARGET!>suspend<!> SAM
typealias Test8 = <!WRONG_MODIFIER_TARGET!>suspend<!> <!UNRESOLVED_REFERENCE!>SuspendFunction0<!><Unit>
typealias Test9 = suspend <!UNSUPPORTED!>(() -> Unit) -> Unit<!>
typealias Test10 = suspend <!UNSUPPORTED!>(suspend () -> Unit) -> Unit<!>
typealias Test11 = suspend () -> (suspend () -> Unit)
typealias Test12 = suspend <!UNSUPPORTED!>(suspend (() -> Unit)) -> Unit<!>