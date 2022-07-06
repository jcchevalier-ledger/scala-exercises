package chapter5

import chapter5.Stream.*

object Exercice_5_9:
  def from(n: Int): Stream[Int] =
    Stream.cons(n, this.from(n + 1))
