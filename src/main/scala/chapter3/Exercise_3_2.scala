package chapter3

import chapter3.List.{Cons, Nil}

object Exercise_3_2:
  def tail[A](list: List[A]): List[A] =
    list match
      case List.Nil      => Nil
      case Cons(_, tail) => tail
