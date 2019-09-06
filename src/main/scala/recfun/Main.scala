package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) {
        1
      } else {
        pascal(c - 1, r - 1) + pascal(c, r - 1)
      }
    }
  
  /**
   * Exercise 2
   */
    def findClosed(chars: List[Char]): Boolean = {
      if (chars.isEmpty) {
        return false
      }
      val char = chars.head

      if (char == ')') {
        return true == balance(chars.tail);
      }

      if (char == '(') {
        return false == balance(chars.tail)
      }

      findClosed(chars.tail)
    }

    def balance(chars: List[Char]): Boolean = {
      if (chars.isEmpty) {
        return true
      }

      val char = chars.head

      if (char == '(') {
        return true == findClosed(chars.tail)
      }

      if (char == ')') {
        return false
      }

      balance(chars.tail)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
