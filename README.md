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
- When we have installed Maven on our computer we need to open Terminal
- Enter a file where we have our project named 'Remintly-exercise'
- Then in our command line we need to write:
```
remintly-exercise % mvn compile
```
```
remintly-exercise % mvn package
```
- We need Maven assembly plugin. This plugin includes all of our applications dependencies into the JAR file. This increases its overall size, but ensures that we can run it as a standalone executable using the java -jar command:
```
remintly-exercise % mvn clean compile assembly:single
```
- Next step is:
```
remintly-exercise % java -jar target/Remintly-exercise-1.0-SNAPSHOT-jar-with-dependencies.jar
```
- The program will show us: "Enter a file path from which you want to verfiy IAM Policy:" and we need to write path. To check example with Resoursce with "*" write:
```
src/main/resources/policy.json
```
- When we want test the opposite, we need to again write:
```
remintly-exercise % java -jar target/Remintly-exercise-1.0-SNAPSHOT-jar-with-dependencies.jar
```
- And next:
```
src/main/resources/policy2.json
```
