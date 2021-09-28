package linter;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static linter.App.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testingNoErr() {

        // testing for a no errors js file
        String noErr = "";
        Path noErrorFile = Paths.get("./src/test/resources/testNoError.js");

        assertEquals(noErr, jsLinter(noErrorFile));
    }

    @Test
    void testOneErr() {
        String oneErr = "Line 1: Missing semicolon.\n";
        Path oneErrorFile = Paths.get("./src/test/resources/testOneError.js");

        assertEquals(oneErr, jsLinter(oneErrorFile));
    }

    @Test
    void testFewErr() {
        String fewErr = "Line 11: Missing semicolon.\n" + "Line 20: Missing semicolon.\n"
                + "Line 28: Missing semicolon.\n" + "Line 33: Missing semicolon.\n";
        Path fewErrorsFile = Paths.get("./src/test/resources/testFewErrors.js");

        assertEquals(fewErr, jsLinter(fewErrorsFile));

    }

    @Test
    void testManyErr() {
        String manyErr = "Line 11: Missing semicolon.\n" + "Line 26: Missing semicolon.\n"
                + "Line 36: Missing semicolon.\n" + "Line 40: Missing semicolon.\n" + "Line 51: Missing semicolon.\n"
                + "Line 60: Missing semicolon.\n" + "Line 68: Missing semicolon.\n" + "Line 78: Missing semicolon.\n"
                + "Line 95: Missing semicolon.\n" + "Line 99: Missing semicolon.\n";
        Path manyErrorsFile = Paths.get("./src/test/resources/testManyErrors.js");

        assertEquals(manyErr, jsLinter(manyErrorsFile));

    }

    @Test
    void testEmptyFile() {
        String empty = "";
        Path emptyFile = Paths.get("./src/test/resources/testEmpty.js");

        assertEquals(empty, jsLinter(emptyFile));

    }
}
