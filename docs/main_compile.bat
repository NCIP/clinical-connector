@echo off
call buildclasspath.cmd .\lib
Echo The Classpath definition is %CLASSPATH%

javac SoapUITest.java