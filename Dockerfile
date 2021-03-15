FROM openjdk:11-oracle
EXPOSE 8281
COPY /target/quadratic-equations-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://root:root@mongo:27017/wizard_db?authSource=admin","-Dspring.profiles.active=dev","-jar","quadratic-equations-0.0.1-SNAPSHOT.jar"]