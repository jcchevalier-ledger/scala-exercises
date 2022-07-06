package chapter6

import chapter6.RNG.Rand

object Exercise_6_5:
  def map[A,B](s: Rand[A])(f: A => B): Rand[B] =
    rng => {
      val (a, rng2) = s(rng)
      (f(a), rng2)
    }

  val double: Rand[Double] =
    map(Exercise_6_1.nonNegativeInt)(_ / (Int.MaxValue.toDouble + 1))
