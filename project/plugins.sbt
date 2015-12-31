scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl"       % "1.0.4")
addSbtPlugin("com.eed3si9n"     % "sbt-assembly"    % "0.12.0")
addSbtPlugin("com.earldouglas"  % "xsbt-web-plugin" % "2.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.6")
