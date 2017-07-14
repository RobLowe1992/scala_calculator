import scala.math._
import scala.io.StdIn.{readLine}
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object sweetLibs {
    def main(args: Array[String]){
        val calc = new Calculator
        var input = 0
        var input2 = 0

        println("Welcome to the Scala command line calculator")
        println("This app will allow you to run several math operations")

        println("Current Operation: Addition")
        println("Provide the first number")
        input = readLine.toInt
        println("Provide the second number")
        input2 = readLine.toInt
        calc.addition(input, input2)

        println("Current Operation: Subtraction")
        println("Provide the first number")
        input = readLine.toInt
        println("Provide the second number")
        input2 = readLine.toInt
        calc.subtraction(input, input2)

        println("Current Operation: Multiplication")
        println("Provide the first number")
        input = readLine.toInt
        println("Provide the second number")
        input2 = readLine.toInt
        calc.multiplication(input, input2)

        println("Current Operation: Division")
        println("Provide the first number")
        input = readLine.toInt
        println("Provide the second number")
        input2 = readLine.toInt
        calc.division(input, input2)

    }

    class Calculator(){
        def addition(num1: Int, num2: Int){
            println(num1 + num2 + "\n")
        }
        def subtraction(num1: Int, num2: Int){
            println(num1 - num2 + "\n")
        }
        def multiplication(num1: Int, num2: Int){
            println(num1 * num2 + "\n")
        }
        def division(num1: Int, num2: Int){
            println(num1 / num2 + "\n")
        }

    }

}