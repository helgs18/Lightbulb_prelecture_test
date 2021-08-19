import java.io.{File, PrintWriter}
import scala.io.Source

object PuzzleReaderWriter {
  // Read from file
  // Should this file create Square array based on input

  // Write to file
  // Write solution to file
  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try{
      op(writer)
    } finally{
      writer.close()
    }
  }


    def fileReader(file: Array[String]):String={
      var outputStr: String = ""
      if (file.length > 0){
        for (line <- Source.fromFile(file(0)).getLines())
          outputStr +=  line + '\n'

        return outputStr
      }
      else
        Console.err.println("Please enter a filename")

      return "Error"
    }

  def saveFunction(str: String): Unit ={
    withPrintWriter(
      new File("puzzle.txt"),
      writer => writer.println(str)
    )
  }

}
