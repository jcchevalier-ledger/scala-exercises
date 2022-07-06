package chapter6

object Exercise_6_3:
  def intDouble(rng: RNG): ((Int, Double), RNG) =
    val (i, r1) = rng.nextInt
    val (d, r2) = Exercise_6_2.double(r1)
    ((i, d), r2)

  def doubleInt(rng: RNG): ((Double, Int), RNG) =
    val ((i, d), r) = intDouble(rng)
    ((d, i), r)

  def double3(rng: RNG): ((Double, Double, Double), RNG) =
    val (d1, r1) = Exercise_6_2.double(rng)
    val (d2, r2) = Exercise_6_2.double(r1)
    val (d3, r3) = Exercise_6_2.double(r2)
    ((d1, d2, d3), r3)

