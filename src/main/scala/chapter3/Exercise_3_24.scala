package chapter3

object Exercise_3_24:
  @annotation.tailrec
  def startsWith[A](list: List[A], prefix: List[A]): Boolean =
    (list, prefix) match
      case (_, List.Nil)                                                     => true
      case (List.Cons(head, tail), List.Cons(head2, tail2)) if head == head2 => startsWith(tail, tail2)
      case _                                                                 => false

  @annotation.tailrec
  def hasSubsequence[A](sup: List[A], sub: List[A]): Boolean =
    sup match
      case List.Nil                  => sub == List.Nil
      case _ if startsWith(sup, sub) => true
      case List.Cons(_, tail)        => hasSubsequence(tail, sub)
