#!/bin/sh

exec 2>&1
exec env -i JAVA_HOME="${JAVA_HOME}" mvn -X -e org.apache.maven.plugins:maven-dependency-plugin:3.1.0-SNAPSHOT:analyze
