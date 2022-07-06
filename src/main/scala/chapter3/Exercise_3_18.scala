package chapter3

object Exercise_3_18:
  def map[A, B](list: List[A])(f: A => B): List[B] =
    List.foldRight(list, List.Nil: List[B])((header, tail) => List.Cons(f(header), tail))
