This illustrates an issue with scala2->scala3 tasty reader.

How to use
1. `git clone git@github.com:johnduffell/tasty-tuple-issue.git`
1. `sbt scala2/compile`

You will see an error in the output 

> Unsupported Scala 3 generic tuple type scala.Tuple in bounds of type MirroredElemTypes; found in  scala.deriving.Mirror.<refinement>.

Full output here:
```
$ sbt scala2/compile
[info] welcome to sbt 1.7.1 (AdoptOpenJDK Java 1.8.0_275)
[info] loading settings for project global-plugins from plugins.sbt ...
[info] loading global plugins from /Users/john_duffell/.sbt/1.0/plugins
[info] loading project definition from /Users/john_duffell/code/tasty-tuple-issue/project
[info] loading settings for project root from build.sbt ...
[info] set current project to tasty-tuple-issue (in build file:/Users/john_duffell/code/tasty-tuple-issue/)
[info] compiling 1 Scala source to /Users/john_duffell/code/tasty-tuple-issue/scala3/target/scala-3.1.3/classes ...
[info] compiling 1 Scala source to /Users/john_duffell/code/tasty-tuple-issue/scala2/target/scala-2.13/classes ...
[error] Unsupported Scala 3 generic tuple type scala.Tuple in bounds of type MirroredElemTypes; found in  scala.deriving.Mirror.<refinement>.
[error] one error found
[error] (scala2 / Compile / compileIncremental) Compilation failed
[error] Total time: 6 s, completed 17-Aug-2022 22:56:25
$
```

