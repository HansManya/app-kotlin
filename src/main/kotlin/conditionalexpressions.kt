fun main(args: Array<String>) {
    var marks = 90
    var grade = if (marks < 50){
        "E"
    }else if (marks < 60){
        "D"
    }else if (marks < 70){
        "C"
    }else if (marks < 80){
        "B"
    }else{
        "A"
    }


    var bettingNumber = 0
    var bettingResult = when(bettingNumber){
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
            "Please enter a number from - 4 to bet "
        }
    }
    println(bettingResult)
}