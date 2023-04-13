package oop


fun main(args: Array<String>){
    //These are objects
    var f1 = Fruit("Mango", "Yellow", "200g", 30.0)
    var f2 = Fruit("Apple", "Red", "250g", 35.0)
    println(f1.name)
    println(f2.price)

    var c1 = Car("Toyota", "KDL 009J", 3000000.0)
    var c2 = Car("Mercedes", "KDF 905Z", 45000000.0)
    println(c2.price)
    println(c1.model)
}


// This is a class
class Fruit(name:String, color:String, size:String, price:Double){
    // Declare Properties
    var name:String
    var color:String
    var size:String
    var price:Double
    // Initialize the properties
    init {
        this.name = name
        this.color = color
        this.size = size
        this.price =price
    }
}

class Car(model:String, reg_no:String, price: Double){
    var model:String
    var reg_no:String
    var price:Double
    init {
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    // These class functions
    fun accelerate(){
        println("yes I can accelerate")

    }

}




