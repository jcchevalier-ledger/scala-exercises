package chapter5

trait Stream[+A]

object Stream {
  case object Empty                                         extends Stream[Nothing]
  case class Cons[+A](head: () => A, tail: () => Stream[A]) extends Stream[A]

  def empty[A]: Stream[A] = Empty
  def cons[A](hd: => A, tl: => Stream[A]): Stream[A] =
    lazy val head = hd
    lazy val tail = tl
    Cons(() => head, () => tail)
}
