package chapter5

import chapter5.Stream.*

object Exercice_5_8:
  def constant[A](a: A): Stream[A] =
    lazy val tail: Stream[A] = Stream.Cons(() => a, () => tail)
    tail
