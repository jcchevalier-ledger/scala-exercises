package chapter6

import chapter6.RNG.Rand

object Exercise_6_9:
  def _map[A, B](s: Rand[A])(f: A => B): Rand[B] =
    Exercise_6_8.flatMap(s)(a => RNG.unit(f(a)))

  def _map2[A, B, C](ra: Rand[A], rb: Rand[B])(f: (A, B) => C): Rand[C] =
    Exercise_6_8.flatMap(ra)(a => Exercise_6_5.map(rb)(b => f(a, b)))
