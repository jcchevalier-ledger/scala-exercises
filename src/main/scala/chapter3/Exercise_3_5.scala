package chapter3

import chapter3.List.{Cons, sum}

object Exercise_3_5:
  @annotation.tailrec
  def dropWhile[A](list: List[A], f: A => Boolean): List[A] =
    list match
      case Cons(head, tail) if f(head) => dropWhile(tail, f)
      case _                           => list
