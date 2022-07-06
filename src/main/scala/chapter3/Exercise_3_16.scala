package chapter3

object Exercise_3_16:
  def add1(list: List[Int]): List[Int] =
    List.foldRight(list, List.Nil: List[Int])((head, tail) => List.Cons(head + 1, tail))
