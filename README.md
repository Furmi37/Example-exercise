## Recruitment task

### Technologies:
- Java (20)
- Maven
- Mockito
- JUnit 5
- InteliJ IDEA
- Lombok
- Json
- Jackson

### Features
It has a method verifying the input JSON data (AWS::IAM::Role Policy)

### Requirements
- Java (20)
- Maven

### How to run project in MacOs Terminal
- When we have installed Maven with on our computer we need to open Terminal, firstly we need to use command below:
```
 source .bash_profile
```
- Next enter a file where we have our project named 'Remitly-exercise'
- Then in our command line we need to write:
```
 mvn compile
```
- Next step is:
```
 mvn package
```
- We need Maven assembly plugin. This plugin includes all of our applications dependencies into the JAR file. This increases its overall size, but ensures that we can run it as a standalone executable using the java -jar command:
```
 mvn clean compile assembly:single
```
- Next step is:
```
 java -jar target/Remintly-exercise-1.0-SNAPSHOT-jar-with-dependencies.jar
```
- The program will show us: "Enter a file path from which you want to verfiy IAM Policy:" and we need to write path. To check example with Resoursce with "*" write:
```
 src/main/resources/policy.json
```
- When we want test opposite Resource, we need to again write:
```
 java -jar target/Remintly-exercise-1.0-SNAPSHOT-jar-with-dependencies.jar
```
- And next:
```
 src/main/resources/policy2.json
```
