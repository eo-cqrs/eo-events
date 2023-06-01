<img alt="logo" src="https://eo-cqrs.github.io/.github/eo-cqrs.svg" height="100px" />

[![Managed By Self XDSD](https://self-xdsd.com/b/mbself.svg)](https://self-xdsd.com/p/eo-cqrs/eo-events?provider=github)

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![DevOps By Rultor.com](https://www.rultor.com/b/eo-cqrs/eo-events)](https://www.rultor.com/p/eo-cqrs/eo-events)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)
<br>

[![mvn](https://github.com/eo-cqrs/eo-events/actions/workflows/mvn.yml/badge.svg)](https://github.com/eo-cqrs/eo-events/actions/workflows/mvn.yml)
[![Hits-of-Code](https://hitsofcode.com/github/eo-cqrs/eo-events)](https://hitsofcode.com/view/github/eo-cqrs/eo-events)
[![PDD status](http://www.0pdd.com/svg?name=eo-cqrs/eo-events)](http://www.0pdd.com/p?name=eo-cqrs/eo-events)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/eo-cqrs/eo-events/blob/master/LICENSE.txt)

Project architect: [@h1alexbel](https://github.com/h1alexbel)

Objects for handling Events.

**Motivation**. We don't have objects or specs for enabling Event Sourcing and events in elegant way. 

**Principles**. These are the [design principles](https://www.elegantobjects.org/#principles) behind eo-kafka.

**How to use**. All you need is this (get the latest version here):

Maven:
```xml
<dependency>
  <groupId>io.github.eo-cqrs</groupId>
  <artifactId>eo-events</artifactId>
</dependency>
```

Gradle:
```groovy
dependencies {
    compile 'io.github.eo-cqrs:eo-events:<version>'
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