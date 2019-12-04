FROM hub.4399doc.com/gprp/alpine-jre1.8:latest

VOLUME /tmp/logs/history-consumer

COPY  history-consumer.jar history-consumer.jar

COPY  entrypoint.sh entrypoint.sh

ENTRYPOINT ["sh","entrypoint.sh"]