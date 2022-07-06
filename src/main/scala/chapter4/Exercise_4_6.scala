package chapter4

import chapter4.Either

object Exercise_4_6:
  case class Right[A](value: A) extends Either[Nothing, A]:
    override def map[B](f: A => B): Either[Nothing, B]                                          = Right(f(value))
    override def flatMap[EE >: Nothing, B](f: A => Either[EE, B]): Either[EE, B]                = f(value)
    override def orElse[EE >: Nothing, B >: A](default: => Either[EE, B]): Either[EE, B]        = this
    override def map2[EE >: Nothing, B, C](other: Either[EE, B])(f: (A, B) => C): Either[EE, C] = other.map(f(value, _))

  case class Left[E](err: E) extends Either[E, Nothing]:
    override def map[B](f: Nothing => B): Either[E, B]                                          = this
    override def flatMap[EE >: E, B](f: Nothing => Either[EE, B]): Either[EE, B]                = this
    override def orElse[EE >: E, B >: Nothing](default: => Either[EE, B]): Either[EE, B]        = default
    override def map2[EE >: E, B, C](other: Either[EE, B])(f: (Nothing, B) => C): Either[EE, C] = this
