#
# Build stage
#
FROM gradle:jdk17-jammy AS build
COPY --chown=gradle:gradle marathon-tracker /home/marathon-tracker/gradle/src
WORKDIR /home/marathon-tracker/gradle/src
RUN gradle build --no-daemon -x test

LABEL org.name="MesyaJeynie"
#
# Package stage
#
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /home/marathon-tracker/gradle/src/build/libs/marathon-tracker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]