package chapter3

object Exercise_3_29:
  def fold[A, B](tree: Tree[A])(f: A => B)(g: (B, B) => B): B = tree match {
    case Tree.Leaf(a)      => f(a)
    case Tree.Branch(l, r) => g(fold(l)(f)(g), fold(r)(f)(g))
  }

  def sizeViaFold[A](tree: Tree[A]): Int =
    fold(tree)(_ => 1)(1 + _ + _)

  def maximumViaFold(tree: Tree[Int]): Int =
    fold(tree)(a => a)(_ max _)

  def depthViaFold[A](tree: Tree[A]): Int =
    fold(tree)(_ => 0)((d1, d2) => 1 + (d1 max d2))

  def size[A](tree: Tree[A]): Int =
    fold(tree)(_ => 1)(1 + _ + _)
