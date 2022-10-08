FROM openjdk:17-jdk-alpine
COPY target/KTTKPM_THBuoi4-0.0.1-SNAPSHOT.jar KTTKPM_THBuoi4-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/KTTKPM_THBuoi4-0.0.1-SNAPSHOT.jar"]