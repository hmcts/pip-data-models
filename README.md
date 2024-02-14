# pip-cron-trigger

## Table of Contents

- [Overview](#overview)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
    - [General](#General)
    - [Local development](#local-development)
  - [Installation](#installation)
    - [Publishing the library](#publishing-the-library)
    - [Importing the library](#importing-the-library)
  - [Fortify](#fortify)
- [Test Suite](#test-suite)
  - [Unit tests](#unit-tests)
- [Contributing](#contributing)
- [License](#license)

## Overview

This repository contains the models used throughout CaTH application.

This project produces a single maven artefact, pushed up to jitpack, which is then used by other CaTH services.

## Getting Started

### Prerequisites

#### General

- [Java JDK 17](https://openjdk.org/projects/jdk/17/) - this is used throughout all of our services.

##### Local development

No specific requirements, other than the standard IDE and Java 17.

### Installation

- Clone the repository
- Build using the command `./gradlew clean build`

#### Publishing the library

This project is a library rather than a spring boot application.

To publish the application to the local repository, use

```bash
  ./gradlew clean build publishToMavenLocal
```
The JAR that is published is also accessible in build/libs/

#### Importing the library

The library can be imported into other projects by using

```bash
  implementation group: 'uk.gov.hmcts.reform', name: 'pip-data-models', version: '0.0.1'
```

in your build.gradle file

### Fortify

We use Fortify to scan for security vulnerabilities. This is run as part of our nightly pipelines.

## Test Suite

This library is comprehensively tested using a suite of unit tests.

### Unit tests

Unit tests can be run on demand using `./gradlew test`.

## Contributing

We are happy to accept third-party contributions. See [.github/CONTRIBUTING.md](./.github/CONTRIBUTING.md) for more details.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

