package chapter3

object Exercise_3_13:
  // See with Christophe if there is a better implementation
  def foldRight[A, B](list: List[A], starter: B)(f: (A, B) => B): B =
    Exercise_3_10.foldLeft(list, starter)((b, a) => f(a, b))

  def foldLeft[A, B](list: List[A], starter: B)(f: (B, A) => B): B =
    List.foldRight(list, (b: B) => b)((a, g) => b => g(f(b, a)))(starter)
