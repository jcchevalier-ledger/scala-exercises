package chapter6

trait RNG:
  def nextInt: (Int, RNG)

object RNG:
  type Rand[+A] = RNG => (A, RNG)

  def unit[A](a: A): Rand[A] = rng => (a, rng)

  case class SimpleRNG(seed: Long) extends RNG:
    def nextInt: (Int, RNG) =
      val newSeed = (seed * 0x5deece66dL + 0xbL) & 0xffffffffffffL
      val nextRNG = SimpleRNG(newSeed)
      val n       = (newSeed >>> 16).toInt
      (n, nextRNG)
