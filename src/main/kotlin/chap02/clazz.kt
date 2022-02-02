package chap02

fun main(args: Array<String>) {
   val name = if (args.size > 0) args[0] else "kotlin"
   println("hello, $name")

   val person = Person("bob", true)
   println(person.name)

//   val sq = Rectangle(10,10)
//   println(sq.isSquare)
}


