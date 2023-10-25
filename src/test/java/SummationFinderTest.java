import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummationFinderTest {

    @Test
    public void verifySumUsingList() {
        SummationFinder summationFinder = new SummationFinder();

        assertEquals(0, summationFinder.findNumberBySumUsingList(new int[]{3, 4, 5, 6}, 1));
        assertEquals(1, summationFinder.findNumberBySumUsingList(new int[]{0, 15, 32, 2000, 15000}, 15));
        assertEquals(2, summationFinder.findNumberBySumUsingList(new int[]{1, 1, 10, 32, 41}, 42));
    }

}