fun main(args:Array<String>) {
    addition(30, 45.0)
    addition(34, 67.89, 45)
}


fun addition( x:Int, y:Double){
    var jibu =  x + y
    println("Your answer $jibu")
}

fun addition(x:Int, y:Double, z:Int){
    var jibu = x + y +z
    println("Your answer $jibu")
}
