package chapter3

object Exercise_3_6:
  def init[A](list: List[A]): List[A] =
    list match
      case List.Nil               => sys.error("init of empty list")
      case List.Cons(_, List.Nil) => List.Nil
      case List.Cons(head, tail)  => List.Cons(head, init(tail))
