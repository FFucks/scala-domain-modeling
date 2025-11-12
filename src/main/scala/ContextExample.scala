def withConnection[T](block: String ?=> T): T =
    given conn: String = "DBConnection"
    block

def query()(using conn: String): Unit =
    println(s"Using connection: $conn")

@main def demoContextFunction(): Unit =
    withConnection {
        query()
    }