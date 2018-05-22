val nm = "android"
var ag = 41
val s1 : Int = 45
val dt : Any = 89

val fnVr : () -> String = fun () : String {
    return "android"
}

fun simple() : Unit {
    ag = 45
    println(nm)
}

fun arrayEx() {
    val arr = arrayOf("Android", "Apple", "Samsung", "HTC")
}


fun inFn() = println("your age is $ag")

fun parmsFn( b1 : Boolean) = println("Value is $b1")

fun main( args : Array<String>) {
    val smObj = object {
        var dt = 10
        var tm = 52

        fun hello () {
            dt = 56
        }
    }
    simple()
    inFn()
    parmsFn(true)
      println("Function is returning ${fnVr()}")
    println("""
    	${smObj.dt}
        """)
}
