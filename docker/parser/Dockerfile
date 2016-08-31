FROM rebase/jre

RUN ulimit -c unlimited

VOLUME /parser

EXPOSE 1111

CMD [ \
        "/usr/lib/jvm/java-8-openjdk-amd64/bin/java", \
        "-server", \
        "-Xmn256m", \
        "-Xms1g", \
        "-Xmx1g", \
        "-XX:+HeapDumpOnOutOfMemoryError", \
        "-XX:HeapDumpPath=/parser/dump-`date`.hprof", \
        "-cp", \
        "/parser/build/libs/parser-1.0-all.jar", \
        "server.Server" \
]
