fun main(args:Array<String>) {
    motto()
    add()
    avg(200, 300.0, 300.0f)
    println(sum(30, 4.5, 34.3f))
}

fun motto(){
    println("Hello this is our motto")
}

fun add(){
    var x = 10
    var y = 20
    var z = x + y
    println(z)
}

fun avg(x:Int, y:Double, z:Float){
    var answer = (x + y + z) / 3.0
    println("Your answer $answer")
}

fun sum(x:Int, y:Double, z:Float): Double{
    var jibu = x + y + z
    return jibu
}
