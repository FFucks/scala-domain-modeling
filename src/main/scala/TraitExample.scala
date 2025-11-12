trait Logger:
    def log(msg: String): Unit = println(s"[LOG] $msg")

trait Timestamped:
    def timestamp: String = java.time.Instant.now.toString

class Service extends Logger, Timestamped:
    def run(): Unit = log(s"Service started at $timestamp")

@main def demoTrait(): Unit =
    Service().run()