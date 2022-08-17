package scala3

sealed trait Scala3ADT

object Scala3ADT {
  // the case object has to be inside the companion object of the sealed trait to cause an issue
  case object AValue extends Scala3ADT
}
