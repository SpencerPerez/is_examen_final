package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

import org.unit.*;

import static org.junit.Assert.*;

public class BubbleSortTest {
    public BubbleSortTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void whenUnorderedInput_thenOrderedOutput() {
        System.out.println("TEST #1 - whenUnorderedInput_thenOrderedOutput");

        // given
        int[] input = new int[]{1, 2, 3, 5, 4};
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #1 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenNullInput_thenNullOutput() {
        System.out.println("TEST #2 - whenNullInput_thenNullOutput");

        // given
        int[] input = null;
        int[] expectedResult = null;

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #2 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenOrderedInput_thenMantainsOutput() {
        System.out.println("TEST #3 - whenOrderedInput_thenMantainsOutput");

        // given
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #3 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenDuplicateItemsInInput_thenOrderedOutput() {
        System.out.println("TEST #4 - whenDuplicateItemsInInput_thenOrderedOutput");

        // given
        int[] input = new int[]{1, 2, 3, 4, 5, 2};
        int[] expectedResult = new int[]{1, 2, 2, 3, 4, 5};

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #4 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenEmptyInput_thenEmptyOutput() {
        System.out.println("TEST #5 - whenEmptyInput_thenEmptyOutput");

        // given
        int[] input = new int[]{};
        int[] expectedResult = new int[]{};

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #5 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenOnlyDuplicatesInput_thenMantainsOutput() {
        System.out.println("TEST #6 - whenEmptyInput_thenEmptyOutput");

        // given
        int[] input = new int[]{1, 1, 1, 1};
        int[] expectedResult = new int[]{1, 1, 1, 1};

        // when
        int[] actualResult = BubbleSort.sortBasic(input);

        // then
        assertArrayEquals("TEST #6 FAILED!!!", expectedResult, actualResult);
    }
}