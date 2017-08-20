package telekarma

import scala.concurrent.duration._
import info.mukel.telegrambot4s.api.declarative.Commands
import info.mukel.telegrambot4s.api.{Polling, Extractors => $}

/**
 * A simple proof of concept to force the Bot reacting
 *
 * @param token Bot's token.
 */
class HelloWorldBot(token: String) extends AbstractBot(token)
  with Polling
  with Commands {

  // String commands.
  onCommand("/hello") { implicit msg =>
    reply("Hello World!")
  }

  // withArgs extracts command arguments.
  onCommand('echo) { implicit msg =>
    withArgs {
      args =>
        reply(args.mkString(" "))
    }
  }

  // withArgs with pattern matching.
  onCommand("/inc") { implicit msg =>
    withArgs {
      case Seq($.Int(i)) =>
        reply("" + (i + 1))

      // Conveniently avoid MatchError, providing hints on usage.
      case _ =>
        reply("Invalid argument. Usage: /inc 123")
    }
  }
}
