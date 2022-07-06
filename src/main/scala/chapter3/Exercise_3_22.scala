package chapter3

object Exercise_3_22:
  def add(list1: List[Int], list2: List[Int]): List[Int] = (list1, list2) match
    case (List.Nil, _)                                      => List.Nil
    case (_, List.Nil)                                      => List.Nil
    case (List.Cons(head1, tail1), List.Cons(head2, tail2)) => List.Cons(head1 + head2, add(tail1, tail2))
