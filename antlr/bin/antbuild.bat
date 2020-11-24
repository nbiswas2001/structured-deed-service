@ECHO OFF
SET ANTLR_OUT_PATH=%PARSER_HOME%\src\main\java\uk\gov\ros\lr\deed\structured\parser\lexers\%1
SET ANTLR_COMPILED_PATH=%PARSER_HOME%\antlr\build\main\classes

IF "%1"=="" ( 
  ECHO Usage: antbuild package_name grammar_name
  ECHO Example: antbuild seg1 Seg1
) ELSE (
  ECHO =====================================================

  @ECHO ON
  cd %PARSER_HOME%\antlr\grammar
  java -classpath "%ANTLR_JAR%" org.antlr.v4.Tool -o %ANTLR_OUT_PATH% -listener -encoding utf-8 -package uk.gov.ros.lr.deed.structured.parser.lexers.%1 %2.g4
  cd ..
  javac -classpath %ANTLR_JAR% -d %ANTLR_COMPILED_PATH% %ANTLR_OUT_PATH%\%2*.java
  ECHO Done !
  ECHO -----------------------------------------------------
)
