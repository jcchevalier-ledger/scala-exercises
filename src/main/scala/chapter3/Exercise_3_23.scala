package chapter3

object Exercise_3_23:
  def zipWith[A, B, C](list1: List[A], list2: List[B])(f: (A, B) => C): List[C] = (list1, list2) match
    case (List.Nil, _)                                      => List.Nil
    case (_, List.Nil)                                      => List.Nil
    case (List.Cons(head1, tail1), List.Cons(head2, tail2)) => List.Cons(f(head1, head2), zipWith(tail1, tail2)(f))
