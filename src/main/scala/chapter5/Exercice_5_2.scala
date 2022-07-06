package chapter5

import chapter5.Stream

object Exercice_5_2:
  extension [A](stream: Stream[A])
    def take(n: Int): Stream[A] = stream match
      case Stream.Cons(head, tail) if n > 1 => Stream.cons(head(), tail().take(n - 1))
      case Stream.Cons(head, _) if n == 1   => Stream.cons(head(), Stream.empty)
      case _                                => Stream.empty
