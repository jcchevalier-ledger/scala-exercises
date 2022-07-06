package chapter3

import chapter3.List.{Cons, sum}

object Exercise_3_3:
  def setHead[A](list: List[A], newHead: A): List[A] = list match
    case List.Nil      => sys.error("Cannot replace head of empty list")
    case Cons(_, tail) => Cons(newHead, tail)
