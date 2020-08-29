FROM openjdk:11-jre
ADD target/stock-quote-manager.jar stock-quote-manager.jar
EXPOSE 8081
ENTRYPOINT["java", "-jar", "stock-quote-manager.jar"]