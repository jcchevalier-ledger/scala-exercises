package chapter3

object Exercise_3_25:
  def size[A](tree: Tree[A]): Int = tree match {
    case Tree.Leaf(_)      => 1
    case Tree.Branch(l, r) => 1 + size(l) + size(r)
  }
