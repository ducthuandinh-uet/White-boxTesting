import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test case kiểm thử hộp trắng bằng phương pháp kiểm thử dòng điều khiển
 */
public class TestCalculateBMI_CFT {
    @Test
    public void testCalculateBMI1() {
        assertEquals("Cân nặng không hợp lệ", BMICalculator.calculateBMI(-1, 1));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Chiều cao không hợp lệ", BMICalculator.calculateBMI(70, -1));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thiếu cân", BMICalculator.calculateBMI(45, 1.75));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Bình thường", BMICalculator.calculateBMI(70, 1.75));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Thừa cân", BMICalculator.calculateBMI(76, 1.75));
    }

    @Test
    public void testCalculateBMI6() {
        assertEquals("Béo phì", BMICalculator.calculateBMI(100, 1.75));
    }
}
