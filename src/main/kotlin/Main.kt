import java.lang.Math.sqrt
import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите x: ")
    val x = reader.nextDouble()

    print("Введите y: ")
    val y = reader.nextDouble()

    print("Введите r: ")
    val r = reader.nextDouble()

    val distance = sqrt(x * x + y * y)

    val result = if (distance > r)
        { "Точка за пределом круга"
        } else
        { "Точка в пределе круга"
        }
    println(result)

    }



