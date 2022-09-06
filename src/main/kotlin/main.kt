import kotlin.math.pow

fun main(){

    var userInput = 0
    println("Please enter 1 to find the area of a square, 2 to find the area of a triangle, 3 to find the area of a rectangle, and 4 to find the area of a circle. To break, enter 9")

    do {
        println("1) Area of a Square")
        println("2) Area of a Triangle")
        println("3) Area of a Rectangle")
        println("4) Area of a Circle")
        println("9) Exit")

        print("Enter Choice: ")
        userInput = readLine()!!.toInt()

        if (userInput == 1){
            var side: Double
            print("Please enter the length of your side: ")
            side = readLine()!!.toDouble()
            println()
            squareArea(side)

        } else if (userInput == 2){
            var base: Double
            var height: Double
            print("Please enter the length of the base of your triangle: ")
            base = readLine()!!.toDouble()
            println()
            print("Now enter the height of your triangle: ")
            height = readLine()!!.toDouble()
            println()
            triArea(base,height)

        } else if (userInput == 3){
            var base: Double
            var height: Double
            print("Please enter the length of the base of your rectangle: ")
            base = readLine()!!.toDouble()
            println()
            print("Now enter the height of your rectangle: ")
            height = readLine()!!.toDouble()
            println()
            recArea(base,height)

        } else if (userInput == 4){
            var diameter: Double
            var radius: Double
            var diamOrRad: Int
            print("Enter 1 if you are using the diameter of your circle, enter 2 if you are using the radius of your circle:")
            diamOrRad = readLine()!!.toInt()
            println()
            if (diamOrRad == 1){
                print("Please enter your diameter: ")
                diameter = readLine()!!.toDouble()
                println()
                diamCircArea(diameter)
            } else if (diamOrRad == 2){
                print("Please enter your radius: ")
                radius = readLine()!!.toDouble()
                println()
                radCircArea(radius)
            }
        }

    }while (userInput != 9)
}

fun squareArea(sideLength: Double){
    println("The area of your square is ${sideLength.pow(2)}")
}

fun triArea(base: Double, height: Double){
    var area =  (base * height)/2
    println("The Area of your triangle is $area")
}

fun recArea(base: Double, height: Double){
    var area =  (base * height)
    println("The Area of your triangle is $area")
}

fun diamCircArea(diameter: Double){
    var radius = diameter/2
    var area = 3.1415 * radius.pow(2)
    println("The area of your circle is $area")
}

fun radCircArea(radius: Double){
    var area = 3.1415 * radius.pow(2)
    println("The area of your circle is $area")
}
