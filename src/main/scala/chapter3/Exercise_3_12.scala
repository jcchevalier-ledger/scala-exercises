package chapter3

object Exercise_3_12:
  def reverse[A](list: List[A]): List[A] =
    Exercise_3_10.foldLeft(list, List[A]())((tail, head) => List.Cons(head, tail))
