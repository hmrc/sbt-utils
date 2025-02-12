resolvers += MavenRepository("HMRC-open-artefacts-maven2", "https://open.artefacts.tax.service.gov.uk/maven2")
resolvers += Resolver.url("HMRC-open-artefacts-ivy2", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(Resolver.ivyStylePatterns)

addSbtPlugin("uk.gov.hmrc"  % "sbt-git-versioning" % "2.7.0")
addSbtPlugin("uk.gov.hmrc"  % "sbt-git-stamp"      % "6.5.0")
addSbtPlugin("uk.gov.hmrc"  % "sbt-setting-keys"   % "1.0.0")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo"      % "0.13.1")
