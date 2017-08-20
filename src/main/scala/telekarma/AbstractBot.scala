package telekarma

import info.mukel.telegrambot4s.api.TelegramBot

/**
  * Basic class to init the new TelegramBot
  *
  * Example:
  * new HelloWorldBot("123456789:qwertyuiopasdfghjklyxcvbnm123456789").run()
  *
  * @param token The token to init the Bot.
  */
abstract class AbstractBot(val token: String) extends TelegramBot
