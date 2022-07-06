package chapter6

import chapter6.RNG.Rand

object Exercise_6_10:
  case class State[S, +A](run: S => (A, S)):

    def flatMap[B](f: A => State[S, B]): State[S, B] =
      State { s =>
        val (a, s1) = run(s)
        f(a).run(s1)
      }

    def map[B](f: A => B): State[S, B] = flatMap(a => State(s => (f(a), s)))

    def map2[B, C](sb: State[S, B])(f: (A, B) => C): State[S, C] = flatMap(a => sb.map(b => f(a, b)))
