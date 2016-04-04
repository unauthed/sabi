# WABI-SABI - Open Access Publishing

Wabi and sabi are two of the key Japanese aesthetic concepts. Their definitions are not exact, but one can get a sense of them from a short discussion of them. Over time, the two have been combined to form a new word, wabi-sabi, meaning an aesthetic sensibility which includes these two related ideas. 

Open source platform for open access publishing of great simplicity and beauty.

## [Wabi](https://github.com/urchinly/wabi) [![Build Status](https://travis-ci.org/urchinly/wabi.svg?branch=master)](https://travis-ci.org/urchinly/wabi)

Wabi means things that are fresh and simple. It denotes simplicity and quietude, and also incorporates rustic beauty. It includes both that which is made by nature, and that which is made by man. It also can mean an accidental or happenstance element (or perhaps even a small flaw) which gives elegance and uniqueness to the whole, such as the pattern made by a flowing glaze on a ceramic object.

The digital asset management component of the WABI-SABI publishing platform.

## Sabi [![Build Status](https://travis-ci.org/urchinly/sabi.svg?branch=master)](https://travis-ci.org/urchinly/sabi)

Sabi means things whose beauty stems from age. It refers to the patina of age, and the concept that changes due to use may make an object more beautiful and valuable. This also incorporates an appreciation of the cycles of life, as well as careful, artful mending of damage.

The administration front-end for the WABI-SABI publishing platform.

### Build and Run

Every module can be build and run with Maven `mvn clean spring-boot:run`, further every module has a `build.sh` script for creating and running the application in a Docker container.

- Maven 3.2
- Java 8
- Docker 10

```
mvn clean install
mvn spring-boot:run
```

### Maven Tips

Build a module

* `mvn clean install`

Run a module

* `mvn spring-boot:run`

* `mvn spring-boot:run -DskipTests`

* `mvn clean install && java -jar ./target/*.jar`

Check and format licence headers across the project

* `mvn license:check` 

* `mvn license:format` 

Check for latest versions

* `mvn versions:display-dependency-updates` 

* `mvn versions:display-plugin-updates`

* `mvn versions:display-property-updates`

### Docker Tips

Run one module

* `docker run -d -e "SPRING_PROFILES_ACTIVE=prod" -p 8088:8088 --name sabi-x -h sabi-x urchinly/sabi-x`
* `docker exec -it sabi-x /bin/sh`

Run all modules

* `docker-compose up` and `docker-compose down`

Remove all containers

* `docker rm $(docker ps -q -a)`

Remove all images

* `docker rmi $(docker images -q -a)`

Remove all volumes

* `docker volume rm $(docker volume ls -q -f dangling=true)`

