@echo off
cd ..\..
set PARSER_HOME=%cd%
set PATH=%PATH%;%JAVA_HOME%\bin;%~dp0
set ANTLR_JAR=%~dp0antlr-4.7-complete.jar
cd antlr
cmd /k