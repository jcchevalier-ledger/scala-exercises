package chapter4

trait Either[+E, +A]:
  def map[B](f: A => B): Either[E, B]
  def flatMap[EE >: E, B](f: A => Either[EE, B]): Either[EE, B]
  def orElse[EE >: E, B >: A](default: => Either[EE, B]): Either[EE, B]
  def map2[EE >: E, B, C](other: Either[EE, B])(f: (A, B) => C): Either[EE, C]
