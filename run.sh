#!/usr/bin/env bash
mvn compile
mvn exec:java -Dexec.mainClass="com.jaemzware.StringWords" -Dexec.args="cat"
