package chapter6

object Exercise_6_1:
  def nonNegativeInt(rng: RNG): (Int, RNG) =
    val (i, r) = rng.nextInt
    (if (i < 0) -(i + 1) else i, r)
