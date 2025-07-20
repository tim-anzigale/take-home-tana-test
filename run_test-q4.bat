@echo off
echo Compiling Question 4...
javac Question4_UniqueProduct.java
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)
echo Running Question 4...
java Question4_UniqueProduct
pause