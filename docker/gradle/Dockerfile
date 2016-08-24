FROM alpine:3.4

ENV GRADLE_VERSION=2.14.1

RUN apk update && \
    apk add openjdk8 curl && \
    apk --no-cache add --virtual build-dependencies curl unzip  && \
    apk --no-cache add bash libstdc++ && \
    cd /usr/lib && \
    curl -O --location --silent --show-error https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip && \
    unzip -q gradle-${GRADLE_VERSION}-bin.zip && \
    ln -s /usr/lib/gradle-${GRADLE_VERSION}/bin/gradle /usr/bin/ && \
    rm -rf gradle-${GRADLE_VERSION}-bin.zip \
          gradle-${GRADLE_VERSION}/bin/gradle.bat \
          gradle-${GRADLE_VERSION}/getting-started.html \
          gradle-${GRADLE_VERSION}/media \
          /opt/jdk/*src.zip && \
    apk del --purge build-dependencies

VOLUME /app /root/.gradle/caches

WORKDIR /app

