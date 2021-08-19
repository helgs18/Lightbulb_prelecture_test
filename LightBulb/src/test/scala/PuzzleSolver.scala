import PuzzleReaderWriter.{fileReader, saveFunction, withPrintWriter}

import java.io.File
import scala.util.matching.Regex

object PuzzleSolver {
  // This is the main file
  // should this be an object file

  def findColumns(squares: String): Int ={
    var i = 0
    while(squares(i) != '\n'){
      i+=1
    }
    return i
  }

  def createArray(input: String){
    // val oneTwo = List(1, 2)
    // val oneTwoThree = oneTwo ::: List(3)
    // Insert:
    //  scala> 1 :: List(2,3)
    //  val res6: List[Int] = List(1, 2, 3)
    // Append? Dersom vi legger de til reverst. Kan bruke 'listname.reverse'
    // Delete? Vi trenger ikke delete

    // remove spaces
    var squares = input.replaceAll(" ", "")

    // find number of columns
    var columns = findColumns(squares)
    println("Number of columns is " + columns)

    // find number of rows
    val newline = new Regex("\\n")
    val rows = (newline findAllIn squares).mkString("").length
    println("Number of rows is " + rows)
  }

  def main(args: Array[String]): Unit ={

    var inputStr: Array[String] = Array("puzzle.txt")
    var myOutput = fileReader(inputStr)
    println(myOutput)

    createArray(myOutput)

    def puzzleSolution = "_ _ _ _ _ _ _\n2 _ _ _ _ _ _\n_ 1 _ 2 0 _ _\nx _ _ _ _ _ _\nx _ _ _ _ _ _\n_ _ _ _ _ 0 _\n2 _ x _ _ _ _"
    saveFunction(puzzleSolution)

  }
}

