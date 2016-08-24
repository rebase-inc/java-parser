FROM python:3.6-alpine

COPY bin/antlr4 /usr/local/bin/antlr4

COPY bin/grun /usr/local/bin/grun

RUN apk update && \
    apk add openjdk8 curl git && \
    curl -O http://www.antlr.org/download/antlr-4.5-complete.jar && \
    mv antlr-4.5-complete.jar /usr/local/lib/. && \
    git clone https://github.com/antlr/grammars-v4.git

VOLUME /out

WORKDIR /grammars-v4

CMD ["antlr4"]
