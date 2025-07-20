@echo off
echo Compiling Question 5...
javac Question5_ClosestMinimum.java
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)
echo Running Question 5...
java Question5_ClosestMinimum
pause