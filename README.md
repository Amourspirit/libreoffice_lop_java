# LibreOffice Java Programming

## Introduction

This repository is an archive of the **Java LibreOffice Programming** java code by Andrew Davison. The website this code was originally found on is no longer available. [WayBack Machine - Java LibreOffice Programming](https://web.archive.org/web/20221221230318/https://fivedots.coe.psu.ac.th/~ad/jlop/) still has a copy of the website for now.

This code has largely been converted to python and is available in the [OOO Development Tools](https://python-ooo-dev-tools.readthedocs.io/en/latest/index.html) (OooDev) project.

The origin book by Andrew Davison can be found in the [
LibreOffice Programming ](https://flywire.github.io/lo-p/) that was converted by [flywire](https://github.com/flywire). The current python version is available in the [OooDev - Python LibreOffice Programming](hhttps://python-ooo-dev-tools.readthedocs.io/en/latest/odev/index.html) documents.

I discovered another archive on GitHub, [jlop-code](https://github.com/hosseinn/jlop-code/tree/main), it currently does not have a development container but may be useful for othere reasons.

## Development Container

This project can run and debug the current java code in a [Development Container](https://code.visualstudio.com/remote/advancedcontainers/overview). The container is based upon the [Live LibreOffice Python](https://github.com/Amourspirit/live-libreoffice-python) template. The container has [LibreOffice](https://www.libreoffice.org/) installed and is accessible via the internal web browser or via your local web browser.

## Code

The code can be found in the [lo/src/main/java/io/github/amourspirt](./lo/src/main/java/io/github/amourspirt) directory.

### Changes

A few file have been changed or updated to work with the current version of [LibreOffice](https://www.libreoffice.org/) and the development container.

The [JNAUtils.java.win](lo/src/main/java/io/github/amourspirt/utils/JNAUtils.java.win) file was renamed from `NAUtils.java` becuase it is not supported in the development container which is Linux.

The `Draw.createDispatchShape()` has been modified to work with Linux. See the comments in the code for more information.

All the Utils code has been placed in `package io.github.amourspirt.utils` package the original code had no package.

### Other Notes

When connecting or starting to [LibreOffice](https://www.libreoffice.org/) the `host` is `localhost` and the `port` is `8100`. In the development container connect with `Lo.loadSocketOffice()` as connection pipe will not work without further configuration.

## Access LibreOffice

Access to LibreOffice is available via the internal web browser or via your local web browser. The port is `3006`. In a development container the URL is `http://localhost:3006`.

See the [Live LibreOffice Python - wiki](https://github.com/Amourspirit/live-libreoffice-python/wiki) for more information.

<details>
<summary>Original Template Readme</summary>

# Live LibreOffice Python

Live LibreOffice Python is a complete development environment for creating, debugging and testing python scripts. It leverages the power of [VS Code] and has [LibreOffice] baked in that can be access via the internal web browser or via your local web browser which allows for a much more pleasant and consistent debugging experience.

With the power of [GitHub Codespaces](https://docs.github.com/en/codespaces/overview) it is possible to have [VS Code] and [LibreOffice] running together. One big benefit is a isolated and [VS Code]/[LibreOffice] environment.

Locally a project based upon this template can also be run in a [Development Container](https://code.visualstudio.com/remote/advancedcontainers/overview).

It is also possible to use [GitHub CLI/CD] to create a workflow that test your project with the presents of LibreOffice. This template has a working example of testing using [GitHub CLI/CD].

There are Built in [Tools](https://github.com/Amourspirit/live-libreoffice-python/wiki/Tools) such as [gitget](https://github.com/Amourspirit/live-libreoffice-python/wiki/Tools#gitget) that allow you to quickly add examples to your project from sources such as [LibreOffice Python UNO Examples]. Also there is a built in [console](https://github.com/Amourspirit/live-libreoffice-python/wiki/Console) to help debug the [API](https://api.libreoffice.org/).

This templated can also be leveraged to demonstrate working examples of code.

[![image](https://github.com/Amourspirit/live-libreoffice-python/assets/4193389/35758c26-63b7-48f9-99c0-84dd19b26a8f)](https://github.com/Amourspirit/live-libreoffice-python/assets/4193389/35758c26-63b7-48f9-99c0-84dd19b26a8f)

## Getting Started

See the [Getting Started](https://github.com/Amourspirit/live-libreoffice-python/wiki/Getting-Started) in the [Wiki](https://github.com/Amourspirit/live-libreoffice-python/wiki).

</details>

[VS Code]:https://code.visualstudio.com/

[LibreOffice]:https://www.libreoffice.org/
[GitHub CLI/CD]:https://resources.github.com/ci-cd/
[LibreOffice Python UNO Examples]:https://github.com/Amourspirit/python-ooouno-ex
