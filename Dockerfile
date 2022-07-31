FROM java:8
WORKDIR /
ADD ./target/singtel-assignment-1.0-SNAPSHOT.jar singtel-assignment-1.0-SNAPSHOT.jar
EXPOSE 8080
CMD java - jar singtel-assignment-1.0-SNAPSHOT.jar