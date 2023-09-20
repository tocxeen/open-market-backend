FROM openjdk:11-jdk-slim
COPY --from-build /target/demo-0.0.1-SNAPSHORT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]