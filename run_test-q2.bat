@echo off
echo Compiling Question 2...
javac Question2_UniqueSums.java
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)
echo Running Question 2...
java Question2_UniqueSums
pause 