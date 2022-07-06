package chapter6

object Exercise_6_4:
  def ints(count: Int)(rng: RNG): (List[Int], RNG) =
    if (count == 0) (List(), rng)
    else
      val (x, r1)  = rng.nextInt
      val (xs, r2) = ints(count - 1)(r1)
      (x :: xs, r2)
