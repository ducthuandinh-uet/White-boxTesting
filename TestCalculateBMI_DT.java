import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test case kiểm thử hộp đen bằng phương pháp lập bảng quyết định
 */
public class TestCalculateBMI_DT {
    @Test
    public void testCalculateBMI1() {
        assertEquals("Cân nặng không hợp lệ", BMICalculator.calculateBMI(-100, -100));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Chiều cao không hợp lệ", BMICalculator.calculateBMI(69, -100));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Cân nặng không hợp lệ", BMICalculator.calculateBMI(700, -100));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Cân nặng không hợp lệ", BMICalculator.calculateBMI(-100, 1.75));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Bình thường", BMICalculator.calculateBMI(69, 1.75));
    }

    @Test
    public void testCalculateBMI6() {
        assertEquals("Thiếu cân", BMICalculator.calculateBMI(45, 1.7));
    }

    @Test
    public void testCalculateBMI7() {
        assertEquals("Thừa cân", BMICalculator.calculateBMI(80, 1.8));
    }

    @Test
    public void testCalculateBMI8() {
        assertEquals("Béo phì", BMICalculator.calculateBMI(90, 1.6));
    }

    @Test
    public void testCalculateBMI9() {
        assertEquals("Cân nặng không hợp lệ", BMICalculator.calculateBMI(700, 1.75));
    }

    @Test
    public void testCalculateBMI10() {
        assertEquals("Cân nặng không hợp lệ", BMICalculator.calculateBMI(-100, 3));
    }

    @Test
    public void testCalculateBMI11() {
        assertEquals("Chiều cao không hợp lệ", BMICalculator.calculateBMI(69, 3));
    }

    @Test
    public void testCalculateBMI12() {
        assertEquals("Cân nặng không hợp lệ", BMICalculator.calculateBMI(700, 3));
    }

}
