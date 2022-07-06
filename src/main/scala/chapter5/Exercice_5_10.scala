package chapter5

import chapter5.Stream.*

object Exercice_5_10:
  def fibs: Stream[Int] =
    def go(f0: Int, f1: Int): Stream[Int] =
      Stream.Cons(() => f0,() =>  go(f1, f0 + f1))
    go(0, 1)
