
name := "First SBT Project"

version := "1.0"

libraryDependencies += "org.apache.spark" %% "spark-core" % "0.9.1"

EclipseKeys.projectFlavor := EclipseProjectFlavor.Scala

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource + EclipseCreateSrc.Managed

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"