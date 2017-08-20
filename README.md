# TelekarmaBot
A simple Telegram Bot for managing the Karma of a group. This project is based on 
[mukel/telegrambot4s](https://github.com/mukel/telegrambot4s).

## Quick Start
After cloning the project you can simply start use the bot within the sbt console. Select the project `telekarma` and launch the 
`HelloWorldBot.run()`: 

```
sbt
[info] Loading global plugins from /home/.sbt/1.0/plugins
[info] Loading project definition from /home/projects/telekarma/telekarmabot/project
[info] Loading settings from build.sbt ...
[info] Set current project to TelekarmaBot (in build file:/home/projects/telekarma/telekarmabot/)
[info] sbt server started at 127.0.0.1:5741
[telekarma]> project telekarma
[info] Set current project to TelekarmaBot (in build file:/home/projects/telekarma/telekarmabot/)
[telekarma]> compile
[success] Total time: 1 s, completed 20-Aug-2017 20:17:00
[telekarma]> console
[info] Starting scala interpreter...
Welcome to Scala 2.12.3 (OpenJDK 64-Bit Server VM, Java 1.8.0_131).
Type in expressions for evaluation. Or try :help.
scala> new HelloWorldBot("YOUR_TOKEN_HERE").run()
```
