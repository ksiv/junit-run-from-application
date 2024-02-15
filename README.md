# junit-run-from-application
an example of junit test being run from java application

# how to run 
1. cd
2. git clone https://github.com/ksiv/junit-run-from-application.git
3. cd junit-run-from-application
4. run `mvn package` - this downloads all dependencies and compiles test class and our executable app
5. run ` java -classpath "./target/test-classes:/root/.m2/repository/org/junit/platform/junit-platform-engine/1.10.1/junit-platform-engine-1.10.1.jar:/root/.m2/repository/org/junit/platform/junit-platform-launcher/1.10.0/junit-platform-launcher-1.10.0.jar:/root/.m2/repository/org/junit/platform/junit-platform-commons/1.10.1/junit-platform-commons-1.10.1.jar:/root/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.10.1/junit-jupiter-engine-5.10.1.jar:/root/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.10.1/junit-jupiter-api-5.10.1.jar:/root/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.10.1/junit-jupiter-params-5.10.1.jar:/root/.m2/repository/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar" example.runner a`

   this executes all tests *tagged* `a` from all test classes found in this case from test file `dummyTest.java`
   changing `a` to `b` will execute all test tagged `b`
