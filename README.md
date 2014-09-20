scalaesh
========

Scala wrapper to use [aesh](https://github.com/aeshell/aesh).

Download:
--------

Universal package:

[scalaesh-0.56.tgz](https://github.com/aeshell/scalaesh/releases/download/0.56/scalaesh-0.56.tgz)

```shell
$ tar xvzf scalaesh-0.56.tgz
```

```shell
$ cd scalaesh-0.56/bin/
```

```shell
$ ./scalaesh
```

Rpm package:

[scalaesh-0.56-1.noarch.rpm](https://github.com/aeshell/scalaesh/releases/download/0.56/scalaesh-0.56-1.noarch.rpm)


```shell
$ sudo yum install scalaesh-0.56-1.noarch.rpm
```

```shell
$ scalaesh
```

Your own build
--------------

Setup scala and sbt...

```shell
$ git clone https://github.com/aeshell/scalaesh.git 
```

```shell
$ cd scalaesh 
```

```shell
$ sbt universal:packageZipTarball
```

```shell
$ sbt rpm:packageBin
```
