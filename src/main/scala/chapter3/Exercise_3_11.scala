package chapter3

object Exercise_3_11:
  def sum(list: List[Int])          = Exercise_3_10.foldLeft(list, 0)(_ + _)
  def product(list: List[Double])   = Exercise_3_10.foldLeft(list, 1.0)(_ * _)
  def length[A](list: List[A]): Int = Exercise_3_10.foldLeft(list, 0)((acc, _) => acc + 1)
