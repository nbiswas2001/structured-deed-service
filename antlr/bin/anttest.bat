@ECHO OFF
IF "%1"=="" ( 
  ECHO Usage: anttest test_num gui/tokens input_file_num recompile?
  ECHO Example: anttest 1 gui 2 y
) ELSE (
  ECHO =====================================================
  SET ANTLR_TEST_OUT_PATH=%PARSER_HOME%\antlr\build\test\src
  SET ANTLR_TEST_COMPILED_PATH=%PARSER_HOME%\antlr\build\test\classes

  @ECHO ON
  IF "%4"=="y" (  
    cd grammar
    java -classpath "%ANTLR_JAR%" org.antlr.v4.Tool -o %ANTLR_TEST_OUT_PATH% -listener -encoding utf-8 Test.g4
    cd ..
    javac -classpath %ANTLR_JAR% -d %ANTLR_TEST_COMPILED_PATH% %ANTLR_TEST_OUT_PATH%\Test*.java
  )

  java -classpath "%ANTLR_JAR%;%ANTLR_TEST_COMPILED_PATH%" org.antlr.v4.gui.TestRig Test test%1 -%2 input%3.txt
  ECHO Done !
  ECHO -----------------------------------------------------
)