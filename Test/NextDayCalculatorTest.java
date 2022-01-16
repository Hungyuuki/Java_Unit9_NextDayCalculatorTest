import com.company.NextDayCalculator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("1 1 2018  --> 2 1 2018")
    public void testNextDay1() {
        int[] day = new int[] {1,1,2018};
        int[] expected = new int[] {2,1,2018};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }
    @Test
    @DisplayName("28 2 2019  --> 1 3 2019")
    public void testNextDay2() {
        int[] day = new int[] {28,2,2019};
        int[] expected = new int[] {1,3,2019};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }
    @Test
    @DisplayName("28 2 2020  --> 1 3 2020")
    public void testNextDay3() {
        int[] day = new int[] {28,2,2020};
        int[] expected = new int[] {1,3,2019};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }
    @Test
    @DisplayName("30 10 2020  --> 1 11 2020")
    public void testNextDay4() {
        int[] day = new int[] {30, 10,2020};
        int[] expected = new int[] {1,11,2020};
        int[] actual = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual);
    }
}
