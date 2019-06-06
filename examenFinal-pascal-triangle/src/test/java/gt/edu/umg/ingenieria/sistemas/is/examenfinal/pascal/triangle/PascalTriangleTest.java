package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import org.junit.*;

import static org.junit.Assert.*;

public class PascalTriangleTest {
    public PascalTriangleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void whenSingleLevelInput_thenSingleLevelOutput() {
        System.out.println("TEST #1 - whenSingleLevelInput_thenSingleLevelOutput");

        // given
        int input = 1;
        String expectedResult = "[1]\n";

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("TEST #1 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenThreeLevelsInput_thenFourLineBreaksOutput() {
        System.out.println("TEST #2 - whenThreeLevelsInput_thenFourLineBreaksOutput");

        // given
        int input = 3;
        int expectedResult = 3;

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        int actualResult = pascalTriangle.build(input).split("\n").length;

        // then
        assertEquals("TEST #2 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenOneLevelInput_thenFourLineCharsOutput() {
        System.out.println("TEST #3 - whenOneLevelInput_thenFourLineCharsOutput");

        // given
        int input = 1;
        int expectedResult = 4;

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        int actualResult = pascalTriangle.build(input).length();

        // then
        assertEquals("TEST #3 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenZeroLevelsInput_thenEmptySingleLevelOutput() {
        System.out.println("TEST #4 - whenZeroLevelsInput_thenEmptySingleLevelOutput");

        // given
        int input = 0;
        String expectedResult = "[]";

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("TEST #4 FAILED!!!", expectedResult, actualResult);
    }

    @Test(expected = java.lang.OutOfMemoryError.class)
    public void whenAboveMaxIntInput_thenThrowsException() {
        System.out.println("TEST #5 - whenZeroLevelsInput_thenEmptySingleLevelOutput");

        // given
        int input = Integer.MAX_VALUE;
        String expectedResult = "";

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("TEST #5 FAILED!!!", expectedResult, actualResult);
    }
}