package chapter3

sealed trait List[+A]

object List:
  def sum(list: List[Int]): Int = list match
    case Nil         => 0
    case Cons(x, xs) => x + sum(xs)

  def product(list: List[Double]): Double = list match
    case Nil          => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs)  => x * product(xs)

  def apply[A](elements: A*): List[A] =
    if (elements.isEmpty) Nil
    else Cons(elements.head, apply(elements.tail: _*))

  def append[A](firstList: List[A], secondList: List[A]): List[A] =
    firstList match
      case Nil              => secondList
      case Cons(head, tail) => Cons(head, append(tail, secondList))

  def foldRight[A, B](list: List[A], starter: B)(f: (A, B) => B): B =
    list match
      case Nil         => starter
      case Cons(x, xs) => f(x, foldRight(xs, starter)(f))

  case class Cons[+A](head: A, tail: List[A]) extends List[A]
  case object Nil                             extends List[Nothing]
