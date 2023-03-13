[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![DevOps By Rultor.com](https://www.rultor.com/b/yegor256/rultor)](https://www.rultor.com/p/yegor256/rultor)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)
<br>

[![PDD status](http://www.0pdd.com/svg?name=eo-cqrs/eo-qce)](http://www.0pdd.com/p?name=eo-cqrs/eo-qce)
[![maven](https://github.com/eo-cqrs/eo-qce/actions/workflows/maven.yml/badge.svg)](https://github.com/eo-cqrs/eo-qce/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/eo-cqrs/eo-qce/branch/master/graph/badge.svg?token=CR7SV7NPBV)](https://codecov.io/gh/eo-cqrs/eo-qce)
[![Hits-of-Code](https://hitsofcode.com/github/eo-cqrs/eo-qce)](https://hitsofcode.com/view/github/eo-cqrs/eo-qce)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/eo-cqrs/eo-qce/blob/master/LICENSE)

Project architect: [@h1alexbel](https://github.com/h1alexbel)

Objects for handling Queries, Commands and Events in Event Sourcing & CQRS.

**Motivation**. We don't have objects for enabling Event Sourcing & CQRS with queries, commands, and events in elegant way. 

**Principles**. These are the [design principles](https://www.elegantobjects.org/#principles) behind eo-kafka.

**How to use**. All you need is this (get the latest version here):

Maven:
```xml
<dependency>
  <groupId>io.github.eo-cqrs</groupId>
  <artifactId>eo-qce</artifactId>
</dependency>
```

Gradle:
```groovy
dependencies {
    compile 'io.github.eo-cqrs:eo-qce:<version>'
}
```

## How to Contribute

Fork repository, make changes, send us a [pull request](https://www.yegor256.com/2014/04/15/github-guidelines.html).
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install
```

You will need Maven 3.3+ and Java 17+.

Our [rultor image](https://github.com/eo-cqrs/eo-kafka-rultor-image) for CI/CD.