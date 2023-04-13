fun main(args: Array<String>) {
    //IF STATEMENTS
    var age = 20
    if (age < 18){
        println("You're under age")
    }else{
        println("Welcome to the party")
    }

    var weight = 80
    var height = 1.9
    var bmi = weight/ (height*height)
    if (bmi<= 18){
        println("underweight")
    }else if (bmi <= 24){
        println("Normal weight")
    }else if (bmi <=29){
        println("overweight")
    }else{
        println("Obese")
    }


    var mkr = 90

    if (mkr<= 50){
        println("D")
    }else if (mkr <= 60){
        println("C")
    }else if (mkr <=70){
        println("B")
    }else{
        println("A")
    }

    //WHEN STATEMENTS
    var bettingNumber = 0
    when(bettingNumber){
        1 -> {
            println("you lost")
        }
        2 -> {
            println("you lost")
        }
        3 -> {
            println("you lost")
        }
        4 -> {
            println("you lost")
        }
        else-> {
            println("Please enter a number from - 4 to bet ")
        }
    }
}
