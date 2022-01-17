@echo off
REM ********   PODESAVANJA - MENJA STUDENT *********
set JCUP_HOME="D:\fax\semestar-5\pp\projekat\tools\cup"
set JAVA_HOME="C:\Program Files\Java\jdk-15.0.1"
set PARSER_CLASS_NAME="Parser"
set CUP_SPEC_NAME="Parser.cup"


REM ********   POZIV JAVA CUP APLIKACIJE  ***********
echo vrednost : %JCUP_HOME%
%JAVA_HOME%\bin\java -classpath %JCUP_HOME% java_cup.Main -parser %PARSER_CLASS_NAME% -symbols sym < %CUP_SPEC_NAME%

PAUSE
