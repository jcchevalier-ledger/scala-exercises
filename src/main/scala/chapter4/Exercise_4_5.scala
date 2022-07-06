package chapter4

import chapter3.List
import chapter4.Exercise_4_1.*
import chapter4.Option

object Exercise_4_5:
  def traverse[A, B](a: List[A])(f: A => Option[B]): Option[List[B]] =
    a match
      case List.Nil              => Some(List.Nil)
      case List.Cons(head, tail) => Exercise_4_3.map2(f(head), traverse(tail)(f))(List.Cons(_, _))
