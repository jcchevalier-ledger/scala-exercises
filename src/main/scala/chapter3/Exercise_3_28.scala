package chapter3

object Exercise_3_28:
  def map[A, B](tree: Tree[A])(f: A => B): Tree[B] = tree match {
    case Tree.Leaf(a)      => Tree.Leaf(f(a))
    case Tree.Branch(l, r) => Tree.Branch(map(l)(f), map(r)(f))
  }
