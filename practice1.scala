//This is input and output code
import scala.io.StdIn.{readLine}
object ScalaTutorial1{
    def main(args: Array[String]){
        var input=""
        println("This will request a value.")
        print("Please enter a string: ")
        input=readLine
        printf(s"You entered: $input",input)
    }
}