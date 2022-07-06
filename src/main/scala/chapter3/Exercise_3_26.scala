package chapter3

object Exercise_3_26:
  def maximum(tree: Tree[Int]): Int = tree match {
    case Tree.Leaf(n)      => n
    case Tree.Branch(l, r) => maximum(l) max maximum(r)
  }
