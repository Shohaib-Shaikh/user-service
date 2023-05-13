# Start with a base image containing Java runtime
FROM openjdk:11

# Add Maintainer Info
LABEL maintainer="shohaibxshaikh@gmail.com"

RUN mkdir -p /opt/project
ADD target/user-service.jar /opt/project
WORKDIR /opt/project

# Make port 9097 available to the world outside this container
EXPOSE 9097

ENTRYPOINT java -jar user-service.jar