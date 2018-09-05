FROM camilomolina/java:8.0.111

MAINTAINER Camilo Molina <camilo@b.nu>

ADD ms1-0.0.1.jar /usr/local/app/sgslabs/app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/usr/local/app/sgslabs/app.jar"]
