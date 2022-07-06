package chapter4

object Exercise_4_1:
  case class Some[A](value: A) extends Option[A]:
    override def map[B](f: A => B): Option[B]                     = Some(f(value))
    override def flatMap[B](f: A => Option[B]): Option[B]         = f(value)
    override def getOrElse[B >: A](default: => B): B              = value
    override def orElse[B >: A](default: => Option[B]): Option[B] = this
    override def filter(f: A => Boolean): Option[A]               = if (f(value)) this else None

  case object None extends Option[Nothing]:
    override def map[B](f: Nothing => B): Option[B]                     = None
    override def flatMap[B](f: Nothing => Option[B]): Option[B]         = None
    override def getOrElse[B >: Nothing](default: => B): B              = default
    override def orElse[B >: Nothing](default: => Option[B]): Option[B] = default
    override def filter(f: Nothing => Boolean): Option[Nothing]         = None
