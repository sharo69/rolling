FROM java:8
VOLUME /tmp
ADD target/rolling-0.0.1-SNAPSHOT.jar socket.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Drolling=1", "-jar","/socket.jar"]
