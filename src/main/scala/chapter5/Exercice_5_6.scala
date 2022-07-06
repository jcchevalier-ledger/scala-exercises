package chapter5

import chapter5.Exercice_5_4.foldRight
import chapter5.Stream.*

object Exercice_5_6:
  extension [A](stream: Stream[A])
    def headOption: Option[A] =
      stream.foldRight(None: Option[A])((head, _) => Some(head))
