package chapter3

import chapter3.List.{Cons, Nil, sum}

object Exercise_3_4:
  @annotation.tailrec
  def drop[A](list: List[A], n: Int): List[A] =
    if (n <= 0) list
    else
      list match
        case Nil           => Nil
        case Cons(_, tail) => drop(tail, n - 1)
