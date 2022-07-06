package chapter5

import chapter5.Exercice_5_11.unfold
import chapter5.Stream.*

object Exercice_5_12:
  def fibs              = unfold((0, 1)) { case (f0, f1) => Some((f0, (f1, f0 + f1))) }
  def from(n: Int)      = unfold(n)(n => Some((n, n + 1)))
  def constant[A](a: A) = unfold(a)(_ => Some((a, a)))
  val ones              = unfold(1)(_ => Some((1, 1)))
