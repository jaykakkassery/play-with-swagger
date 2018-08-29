name := "MyPlayProject"
 
version := "1.0" 
      
lazy val `myplayproject` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice,
 "io.swagger" %% "swagger-play2" % "1.6.0",
  "org.webjars" % "bootstrap" % "3.3.6",
  "org.webjars" %% "webjars-play" % "2.6.3",
  "org.webjars" % "swagger-ui" % "3.18.1",
  "org.webjars" % "requirejs" % "2.2.0"
)


unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      