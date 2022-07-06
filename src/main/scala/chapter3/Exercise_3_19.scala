package chapter3

object Exercise_3_19:
  def filter[A](list: List[A])(f: A => Boolean): List[A] =
    List.foldRight(list, List.Nil: List[A])((head, tail) => if (f(head)) List.Cons(head, tail) else tail)
