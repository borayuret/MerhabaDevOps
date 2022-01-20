FROM adoptopenjdk/openjdk14:ubi
COPY target/MerhabaDevOps-0.0.1-SNAPSHOT.jar merhabadevops.jar
CMD ["java", "-jar", "merhabadevops.jar"]
EXPOSE 6767