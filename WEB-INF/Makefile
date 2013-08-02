#Compile files from src/main/java to classes.

.PHONY: default
default: compile

# Compile src/main/java -> classes
.PHONY: compile
compile:
	javac -d classes -sourcepath src/main/java -cp $(CATALINA_HOME)/lib/*:lib/*:classes $(shell find src/main/java -type f -name '*.java')

.PHONY: clean
clean:
	rm -rf classes/*
