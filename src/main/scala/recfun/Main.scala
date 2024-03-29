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
    def balance(chars: List[Char], count: Int = 0, isBalanced: Boolean = true): Boolean = {
      if (chars.isEmpty) {
        count == 0 && isBalanced
      } else {
        val char = chars.head

        if (char == '(') {
          balance(chars.tail, count + 1, false)
        } else if (char == ')') {
          balance(chars.tail, count - 1, true)
        } else {
          balance(chars.tail, count, isBalanced)
        }
      }
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (coins.isEmpty || money < 0) {
        0
      } else if (money == 0) {
        1
      } else {
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
      }
    }
  }
