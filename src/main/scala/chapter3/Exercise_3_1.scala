package chapter3

object Exercise_3_1:
  val x: Int = List(1, 2, 3, 4, 5) match
    case List.Cons(x, List.Cons(2, List.Cons(4, _)))               => x
    case List.Nil                                                  => 42
    case List.Cons(x, List.Cons(y, List.Cons(3, List.Cons(4, _)))) => x + y
    case List.Cons(head, tail)                                     => head + List.sum(tail)
    case _                                                         => 101
