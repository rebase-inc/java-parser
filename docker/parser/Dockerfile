FROM rebase/jre

VOLUME /parser

EXPOSE 1111

CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-cp", "/parser/build/libs/parser-1.0-all.jar", "server.Server"]
