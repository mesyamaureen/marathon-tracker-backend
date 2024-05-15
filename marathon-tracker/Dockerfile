#
# Build stage
#
FROM gradle:jdk17-jammy AS build
COPY --chown=gradle:gradle marathon-tracker /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

LABEL org.name="MesyaJeynie"
#
# Package stage
#
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /home/gradle/src/build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]