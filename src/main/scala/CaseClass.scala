sealed trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(width: Double, height: Double) extends Shape

@main def demoCase(): Unit =
    val s: Shape = Circle(10)
    s match
        case Circle(r) => println(s"Area: ${Math.PI * r * r}")
        case Rectangle(w, h) => println(s"Area: ${w * h}")