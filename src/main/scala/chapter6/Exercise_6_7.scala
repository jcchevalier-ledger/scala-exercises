package chapter6

import chapter6.RNG.Rand

object Exercise_6_7:
  def sequence[A](fs: List[Rand[A]]): Rand[List[A]] =
    fs.foldRight(RNG.unit(List[A]()))((f, acc) => Exercise_6_6.map2(f, acc)(_ :: _))
