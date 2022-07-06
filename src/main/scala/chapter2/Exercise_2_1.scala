package chapter2

object Exercise_2_1:
  def main(args: Array[String]): Unit =
    println(fibonnaci(5))

  def fibonnaci(n: Int): Int =
    def loop(n: Int): Int =
      if (n == 0) 0
      else if (n == 1) 1
      else loop(n - 1) + loop(n - 2)
    loop(n + 1)
