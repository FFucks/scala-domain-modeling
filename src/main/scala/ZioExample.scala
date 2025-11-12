import zio._

object ZioExample extends ZIOAppDefault:

    def fetchNumber: ZIO[Any, Nothing, Int] =
        ZIO.succeed {
            Thread.sleep(300)
            42
        }

    val program: ZIO[Any, Nothing, Unit] =
        for
            n <- fetchNumber
            _ <- ZIO.succeed(println(s"result of (ZIO): $n"))
        yield ()

    def run = program
