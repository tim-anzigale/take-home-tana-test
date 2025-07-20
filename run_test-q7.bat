@echo off
echo Compiling Question 7...
javac Question7_RotateList.java
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)
echo Running Question 7...
java Question7_RotateList
pause