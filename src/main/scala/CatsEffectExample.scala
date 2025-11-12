import cats.effect.{IO, IOApp}

object CatsEffectExample extends IOApp.Simple:

    def fetchNumber: IO[Int] =
        IO.sleep(scala.concurrent.duration.Duration(300, "millis")) *> IO.pure(7 * 6)

    val program: IO[Unit] =
        for
            fiber <- fetchNumber.start
            _     <- IO.println("running...")
            n     <- fiber.joinWithNever
            _     <- IO.println(s"result (Cats): $n")
        yield ()

    def run: IO[Unit] = program
