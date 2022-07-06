package chapter3

object Exercise_3_9:
  def length[A](list: List[A]): Int = List.foldRight(list, 0)((_, counter) => counter + 1)
