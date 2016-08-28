# Babelian Technology Parser
Throw code at it, in virtually any language, get a dictionary of technologies used.

# List of supported languages
Thus far:
Java
C++

# Build the docker images
```shell
. activate
make-jre-image
build-docker
```

# How to add language support to Parser from an ANTLR grammar
```
```
## Generate a Lexer and Parser for the language
```shell
ls-grammar
# ...
# clojure/Clojure.g4
# ...

gen-parser clojure/Clojure.g4

# there should be no error emitted
# output should be in src/main/java/lang/clojure/
ls -la src/main/java/lang/clojure/

# Clojure.tokens
# ClojureLexer.java
# ClojureLexer.tokens
# ClojureParser.java

# no harm if you leave the .tokens files, but we don't need them
rm /src/main/java/lang/clojure/*.tokens

```
