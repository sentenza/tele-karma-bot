package telekarma

import org.scalatest._

class HelloWorldBotSpec extends FlatSpec with Matchers {
  behavior of "HelloWorldbot"

  "The HelloWorldBot object" should "fail compiling with an Int param" in {
    val number = 21
    assertTypeError("val hwb = new HelloWorldBot(number)")
  }
}

