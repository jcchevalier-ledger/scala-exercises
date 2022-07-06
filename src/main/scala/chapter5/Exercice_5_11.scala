package chapter5

import chapter5.Stream.*

object Exercice_5_11:
  def unfold[A, S](z: S)(f: S => Option[(A, S)]): Stream[A] =
    f(z) match
      case Some((head, s)) => Stream.cons(head,unfold(s)(f))
      case None         => Stream.empty
