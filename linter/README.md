# JavaScript Linter

Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

## Error Message sample

"Line 3: Missing semicolon."

## Rules

**Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.**

- Don’t show an error if the line is empty.
- Don’t show an error if the line ends with an opening curly brace {
- Don’t show an error if the line ends with an closing curly brace }
- Don’t show an error if the line contains if or else

Call that method in main method on the file gates.js, and print out the resulting error message.

## Testing

**Test these 5 js files in 5 different cases using JUnit as below:**

- Test the linter on a file that contains no errors.
- Test the linter on a file that contains one error.
- Test the linter on a file that contains few errors.
- Test the linter on a file that contains many errors.
- Test the linter on an empty file.
