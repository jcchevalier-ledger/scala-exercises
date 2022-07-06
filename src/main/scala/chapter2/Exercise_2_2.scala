package chapter2

import scala.annotation.tailrec

object Exercise_2_2:
  def isSorted[T](array: Array[T], f: (T, T) => Boolean): Boolean =
    @tailrec
    def loop(n: Int): Boolean =
      if (n == array.length - 1) true
      else if (f(array(n), array(n + 1))) loop(n + 1)
      else false

    loop(0)
