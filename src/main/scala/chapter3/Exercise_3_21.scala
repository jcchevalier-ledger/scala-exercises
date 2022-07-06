package chapter3

object Exercise_3_21:
  def filter[A](list: List[A])(f: A => Boolean): List[A] =
    Exercise_3_20.flatMap(list)(elem => if (f(elem)) List(elem) else List.Nil: List[A])
