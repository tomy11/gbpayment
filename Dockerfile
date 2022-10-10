FROM openjdk:17-jdk-alpine

ARG TIMEZONE="Asia/Bangkok"

ADD ./target/*.jar /app/

CMD java $JAVA_OPTS -jar /app/*.jar -Duser.timezone=${TIMEZONE}

ENV TZ ${TIMEZONE}

EXPOSE 8080
