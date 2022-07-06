package chapter5

import chapter5.Stream

object Exercice_5_4:
  extension [A](stream: Stream[A])
    def foldRight[B](z: => B)(f: (A, => B) => B): B =
      stream match {
        case Stream.Cons(head, tail) => f(head(), tail().foldRight(z)(f))
        case _ => z
      }

    def forAll(f: A => Boolean): Boolean =
      foldRight(true)((a, b) => f(a) && b)
