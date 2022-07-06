package chapter4

import chapter4.Exercise_4_1.*
import chapter4.Option

object Exercise_4_3:
  def map2[A, B, C](option1: Option[A], option2: Option[B])(f: (A, B) => C): Option[C] =
    option1.flatMap(elem1 => option2.map(elem2 => f(elem1, elem2)))
