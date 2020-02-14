From java:8
EXPOSE 700
ARG MAVEN_VERSION=latest
FROM maven:${MAVEN_VERSION}
ENTRYPOINT ["mvn"]
RUN ADD ./target/certifications-0.0.1-SNAPSHOT.jar certifications-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","certifications-0.0.1-SNAPSHOT.jar"]
