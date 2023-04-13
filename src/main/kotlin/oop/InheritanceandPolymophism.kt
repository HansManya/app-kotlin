package oop


fun main(args: Array<String>) {
    //Inheritance and polymorphism
    var s1 = Student("Shem", "shem@gmail.com", "shem123")
    var s2 = Student("Sly", "sly@gmail.com", "sly123")
    s1.login()
    s2.register()

    var t1 = Teacher("King", "king@gmail.com", "king123")
    t1.register()
    t1.login()
    t1.suspendStudent()

    var ht1 = Teacher("Kings", "kings@gmail.com", "kings123")
    ht1.register()
    ht1.login()
    ht1.suspendStudent()


}


open class Student(open var name:String, open var email:String, open var password:String){

    fun register(){
        println("You registerd with $email and password $password")
    }
    fun login(){
        println("you logged in with $email and password $password")
    }
}

open class  Teacher(name:String, email:String, password:String):Student(name, email, password){
    fun suspendStudent(){
        println("Yes I can suspend a student")
    }
}

class Headteacher(name:String, email: String, password: String):Teacher(name, email, password){
    fun approveFunds(){
        println("Yeah I can approve funds")
    }
}