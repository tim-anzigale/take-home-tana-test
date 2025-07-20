@echo off
echo Compiling Question 3...
javac Question3_ArraystoZero.java
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)
echo Running Question 3...
java Question3_ArraystoZero
pause