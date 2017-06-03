# Completable Future with JAX-RS 2.1 CDI 2.0 (Java EE 8) Demo

For this demo you need installed latest Java 9 JDK.

Follow next steps to start the server:

1. Run `mvn install` in project's main folder

2. Run org.iproduct.demo.profiler.StreamingServer with following VM arguments: 
```
--add-modules=java.se.ee --permit-illegal-access  --patch-module java.xml.ws.annotation=./myannotation.jar
```

3. Open http://localhost:8686/javacpu/

Enjoy!