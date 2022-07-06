package chapter4

import chapter3.List
import chapter4.Either
import chapter4.Exercise_4_6.*

object Exercise_4_7:
  def traverse[E, A, B](es: List[A])(f: A => Either[E, B]): Either[E, List[B]] =
    es match
      case List.Nil              => Right(List.Nil)
      case List.Cons(head, tail) => f(head).map2(traverse(tail)(f))(List.Cons(_, _))
