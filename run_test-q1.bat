@echo off
echo Compiling...
javac Question1_GetLongestString.java
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)
echo Running...
java Question1_GetLongestString
pause