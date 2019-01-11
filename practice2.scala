//Using Map
import scala.io.StdIn._

object SacalTutorial2{
    def main(args:Array[String]){
        var input:Int=0
        print("Please enter an integer: ")
        input=readInt
        (1 to input).map(x=>{
            println(calculateSquare(x))
        })
    }
    def calculateSquare(x: Int):Int={
        x*x
    }
}