package chapter5

import chapter5.Stream

object Exercice_5_3:
  extension [A](stream: Stream[A])
    def takeWhile(f: A => Boolean): Stream[A] = stream match {
      case Stream.Cons(head, tail) if f(head()) => Stream.cons(head(), tail() takeWhile f)
      case _                    => Stream.empty
    }
