/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library testing = new Library();

    @Test
    void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    public void testroll() {
        int rollsNum = 4;
        assertEquals(rollsNum, testing.roll(rollsNum).length);
    }

    @Test
    public void containsDuplicates() {
        assertTrue(testing.containsDuplicates(new int[] { 1, 3, 4, 4 }));
    }

    @Test
    public void average() {
        assertEquals(3.25, testing.average(new int[] { 4, 5, 1, 3 }));
    }

    @Test
    public void lowestAverage() {
        assertArrayEquals(new int[] { 1, 2, 3, 4 },
                testing.lowestAverage(new int[][] { { 1, 2, 3, 4 }, { 1, 3, 5, 7 } }));
    }

}
