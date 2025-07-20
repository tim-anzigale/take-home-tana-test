@echo off
echo ========================================
echo Running all tests for Tana assessment
echo ========================================
echo.

echo Compiling all Java files first...
javac Question1_GetLongestString.java
if errorlevel 1 (
    echo ERROR: Question1 failed to compile!
    pause
    exit /b 1
)

javac Question2_UniqueSums.java
if errorlevel 1 (
    echo ERROR: Question2 failed to compile!
    pause
    exit /b 1
)

javac Question3_ArraystoZero.java
if errorlevel 1 (
    echo ERROR: Question3 failed to compile!
    pause
    exit /b 1
)

javac Question4_UniqueProduct.java
if errorlevel 1 (
    echo ERROR: Question4 failed to compile!
    pause
    exit /b 1
)

javac Question5_ClosestMinimum.java
if errorlevel 1 (
    echo ERROR: Question5 failed to compile!
    pause
    exit /b 1
)

javac Question6_MostCommonStrings.java
if errorlevel 1 (
    echo ERROR: Question6 failed to compile!
    pause
    exit /b 1
)

javac Question7_RotateList.java
if errorlevel 1 (
    echo ERROR: Question7 failed to compile!
    pause
    exit /b 1
)

echo All files compiled successfully!
echo.

echo ========================================
echo QUESTION 1: Get Longest String
echo ========================================
echo Running test...
java Question1_GetLongestString
echo.
echo Expected result: ABCDABDCA
echo.

echo ========================================
echo QUESTION 2: Unique Sums  
echo ========================================
echo Running test...
java Question2_UniqueSums
echo.
echo Expected: 3 ways for target=10, 1 way for target=17
echo.

echo ========================================
echo QUESTION 3: Arrays to Zero
echo ========================================
echo Running test...
java Question3_ArraystoZero
echo.
echo Expected: 1 (should be possible to make zeros)
echo.

echo ========================================
echo QUESTION 4: Unique Product
echo ========================================
echo Running test...
java Question4_UniqueProduct
echo.
echo Expected: Computer
echo.

echo ========================================
echo QUESTION 5: Closest Minimum
echo ========================================
echo Running test...
java Question5_ClosestMinimum
echo.
echo Expected: 3 (distance between minimum values)
echo.

echo ========================================
echo QUESTION 6: Most Common Strings
echo ========================================
echo Running test...
java Question6_MostCommonStrings
echo.
echo Expected: words sorted alphabetically by frequency
echo.

echo ========================================
echo QUESTION 7: Rotate List
echo ========================================
echo Running test...
java Question7_RotateList
echo.
echo Expected: rotated list with last 2 elements moved to front
echo.

echo ========================================
echo All tests completed!
echo ========================================
echo If any test failed, check the individual question files
echo You can also run individual tests using run_test-q1.bat, etc.
echo.
pause