From java:8
RUN ADD certifications-0.0.1-SNAPSHOT.jar certifications-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","certifications-0.0.1-SNAPSHOT.jar"]