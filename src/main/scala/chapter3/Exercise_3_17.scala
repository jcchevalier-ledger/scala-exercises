package chapter3

object Exercise_3_17:
  def doubleToString(list: List[Double]): List[String] =
    List.foldRight(list, List.Nil: List[String])((header, tail) => List.Cons(header.toString, tail))
