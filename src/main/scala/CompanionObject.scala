class Person(val name: String)

object Person:
    def apply(name: String): Person = new Person(name)
    def hello(): Unit = println("Hello from companion!")

@main def demoCompanion(): Unit =
    val p = Person("Fábio")
    Person.hello()