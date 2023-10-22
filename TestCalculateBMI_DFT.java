import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test case kiểm thử dòng dữ liệu với độ phủ all-p-uses/some-c-uses
 */
public class TestCalculateBMI_DFT {
    @Test
    public void testCalculateBMI1() {
        assertEquals("Bình thường", BMICalculator.calculateBMI(70, 1.75));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Thừa cân", BMICalculator.calculateBMI(75, 1.75));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Béo phì", BMICalculator.calculateBMI(90, 1.6));
    }
}
