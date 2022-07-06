package chapter5

import chapter5.Stream

object Exercice_5_1:
  extension [A](stream: Stream[A])
    def toList: List[A] =
      stream match
        case Stream.Cons(head, tail) => head() :: tail().toList
        case _                       => List()
