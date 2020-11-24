@ECHO OFF
IF "%1"=="" ( 
  ECHO antrun  package_name grammar_name  gui/tokens rule_name input_file_num
  ECHO Example: antrun seg1 Seg1 gui block 1  
  ECHO Note: It doesn't run the first time
) ELSE (
  ECHO Running ...	
  SET ANTLR_COMPILED_PATH=%PARSER_HOME%\antlr\build\main\classes
  java -classpath "%ANTLR_JAR%;%ANTLR_COMPILED_PATH%" org.antlr.v4.gui.TestRig uk.gov.ros.lr.deed.structured.parser.lexers.%1.%2 %4 -%3 input%5.txt
)