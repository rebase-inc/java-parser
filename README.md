# Babelian Technology Parser
Throw code at it, in virtually any language, get a dictionary of technologies used.

# List of supported languages
Java
C
C++
Clojure
Go

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

## Add the new Lexer and Parser classes to the Parser java project
If you used the commands in 'activate', the generated files should already be in the proper location
to be integrated by the build.
Now we need to write a small amount of code to finish the job.

### Make an Language class
#### Copy & Paste from another language
Use an existing class that implements Language and copy it under your new 'lang/<new_lang>' sub-dir.
Modify import statements relevant to your language.
Modify other mentions of the previous language to your new one (class name, etc.)

#### Identify the root of the parse tree.
Usually this means the top-most grammar rule that encapsulate all the other rules.
In other words, a rule to define a 'file'.
It doesn't have to be a file though, so every language differs a bit on that topic.
In C++, it's known as the 'translation unit'. 
In Java, it's known as the 'compilation unit'.
In Clojure, it's known as a goddamn 'file' (because Clojure isn't so pretentious).

The problem becomes more complex with languages with preprocessors such as C/C++.
We should not treat a .c file as if it is a translation unit, because that supposes
it has been preprocessed.

But we can't simply preprocess the files ourselves, unless
we have high-level knowledge about the layout of the files, in particular header files
and libraries.

We only parse files coming from Git commit.

1. Open in the *Parser.java file
2. Search for 'ruleNames' array of Strings.
3. Usually, the root rule is indeed the first rule (e.g. 'translationunit' in C++)
4. Search for a method whose name is that rule
5. Note the return type (TranslationunitContext)
6. In the Language file (e.g. 'lang/cpp/CPP14.java'), modify the 'tree' declaration to work with the top rule:
```java
CPP14Parser.TranslationunitContext tree = parser.translationunit();
```

### Modify lang/Languages class
Just add a new instance of your language into the static collection.
For example:
```java
Language clojure = new Clojure();
languages_by_name.put(clojure.name(), clojure);
```

### Build the project!
```shell
gradle build
```

