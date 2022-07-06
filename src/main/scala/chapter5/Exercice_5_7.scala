package chapter5

import chapter5.Exercice_5_4.foldRight

object Exercice_5_7:
  extension [A](stream: Stream[A])
    def map[B](f: A => B): Stream[B] =
      stream.foldRight(Stream.empty[B])((head, tail) => Stream.cons(f(head), tail))

    def filter(f: A => Boolean): Stream[A] =
      stream.foldRight(Stream.empty[A])((head, tail) => if (f(head)) Stream.cons(head, tail) else tail)

    def append[B >: A](s: => Stream[B]): Stream[B] =
      stream.foldRight(s)((head, tail) => Stream.cons(head, tail))

    def flatMap[B](f: A => Stream[B]): Stream[B] =
      stream.foldRight(Stream.empty[B])((head, tail) => f(head).append(tail))
