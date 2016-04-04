#
# Copyright (C) 2016 Urchinly <wabi@urchinly.uk>
#

FROM java:alpine
MAINTAINER docker@urchinly.uk
LABEL uk.urchinly.tech=SpringBoot
LABEL uk.urchinly.tech=sabi
EXPOSE 8080
COPY ./target/sabi-*.jar app.jar
RUN /bin/sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
