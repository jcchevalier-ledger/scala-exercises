package chapter6

object Exercise_6_2:
  def double(rng: RNG): (Double, RNG) =
    val (i, r) = Exercise_6_1.nonNegativeInt(rng)
    (i / Int.MaxValue.toDouble, r)
