From java:8
VOLUME /tmp
ADD target/certifications-0.0.1-SNAPSHOT.jar certifications-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/certifications-0.0.1-SNAPSHOT.jar"]
