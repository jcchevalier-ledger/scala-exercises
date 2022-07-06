package chapter3

object Exercise_3_20:
  def flatMap[A, B](list: List[A])(f: A => List[B]): List[B] =
    Exercise_3_15.concat(Exercise_3_18.map(list)(f))
