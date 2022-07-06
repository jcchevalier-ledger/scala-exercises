package chapter4

import chapter3.List
import chapter4.Exercise_4_1.*
import chapter4.Option

object Exercise_4_4:
  def sequence[A](a: List[Option[A]]): Option[List[A]] =
    a match
      case List.Nil                          => Some(List.Nil)
      case List.Cons(headOption, tailOption) => headOption.flatMap(head => sequence(tailOption).map(List.Cons(head, _)))
