@echo off
echo Compiling Question 6...
javac Question6_MostCommonStrings.java
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)
echo Running Question 6...
java Question6_MostCommonStrings
pause
