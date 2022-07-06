package chapter3

object Exercise_3_14:
  def append[A](list: List[A], list2: List[A]): List[A] = List.foldRight(list, list2)(List.Cons(_, _))
