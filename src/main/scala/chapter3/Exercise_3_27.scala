package chapter3

object Exercise_3_27:
  def depth[A](tree: Tree[A]): Int = tree match {
    case Tree.Leaf(_)      => 0
    case Tree.Branch(l, r) => 1 + (depth(l) max depth(r))
  }
