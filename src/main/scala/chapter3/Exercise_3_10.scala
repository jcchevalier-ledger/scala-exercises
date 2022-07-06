package chapter3

object Exercise_3_10:
  @annotation.tailrec
  def foldLeft[A, B](list: List[A], starter: B)(f: (B, A) => B): B =
    list match
      case List.Nil              => starter
      case List.Cons(head, tail) => foldLeft(tail, f(starter, head))(f)
