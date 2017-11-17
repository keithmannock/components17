## Examples from class

Once the files have been created you should see the following hierarchy.

```
.
├── example
│   ├── example
│   │   ├── Example.class
│   │   ├── Example.java
│   │   └── internal
│   │       ├── ExampleImpl.class
│   │       └── ExampleImpl.java
│   ├── module-info.class
│   └── module-info.java
├── hellomod
│   ├── hello
│   │   ├── HelloWorld.class
│   │   └── HelloWorld.java
│   ├── module-info.class
│   └── module-info.java
└── mainmod
    ├── main
    │   ├── Launcher.class
    │   └── Launcher.java
    ├── module-info.class
    └── module-info.java
 ```

We then need to follow a (some what torturous) build sequence. 
This sequence may vary as the version of JPMS is updated by Oracle (it already does 
something different to what it did a month ago).

## Hello World example

This refers to the `hellomod` module spec.

Compilation sequence:

1. First compile the `module-info.java` file:


     ``` 
   javac hellomod/module-info.java
   ```
2. Then the actual class file `HelloWorld.java`:

 	```
 	javac hellomod/hello/HelloWorld.java
 	```
3. Then run the `main` class:

	```
	java --module-path hellomod --module hellomod/hello.HelloWorld
	```
	or
	```
	java -p hellomod -m hellomod/hello.HelloWorld
	
## Extended example


