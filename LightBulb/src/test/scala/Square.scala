class Square(val x: Int, val y: Int, val char: Char) {
  val posx: Int = x
  val posy: Int = y
  val value: Char = char
  var isLit = false
  var isLight: Boolean = false
  var cannotBeLight = false
  var block = false

  def litSquare()={
    this.isLit = true
  }

  def setLightbulb(): Unit ={
    this.isLight = true
  }

  def setCannotBeLight(): Unit = {
    this.cannotBeLight = true
  }

  def set_nr4_lightbulbs(): Unit ={

  }

  def set_nr0_nolightbulbs(): Unit ={

  }
}