package chapter3

object Exercise_3_15:
  def concat[A](list: List[List[A]]): List[A] = List.foldRight(list, List.Nil)(List.append[A])
