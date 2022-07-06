package chapter5

import chapter5.Exercice_5_4.foldRight
import chapter5.Stream.*

object Exercice_5_5:
  extension [A](stream: Stream[A])
    def takeWhile(f: A => Boolean): Stream[A] =
      stream.foldRight(empty[A])((head, tail) =>
        if (f(head)) Stream.cons(head, tail)
        else Stream.empty
      )
