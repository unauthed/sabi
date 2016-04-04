mvn clean install -P prod

docker build --rm -t urchinly/sabi-mailer .

docker run -it -p 8080:8080 --memory 1g --rm --name sabi-mailer urchinly/sabi-mailer
