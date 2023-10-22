public class BMICalculator {
    public static String calculateBMI(double weight, double height) {
        if (weight <= 0 || weight >= 600) return "Cân nặng không hợp lệ";
        if (height <= 0 || height >= 3) return "Chiều cao không hợp lệ";
        double BMI = weight / height / height;
        BMI = Math.round(BMI * 10) / 10.0;
        if (BMI < 18.5) {
            return "Thiếu cân";
        }
        if (BMI < 23) {
            return "Bình thường";
        }
        if (BMI < 25) {
            return "Thừa cân";
        }
        return "Béo phì";
    }

    public static void main(String[] args) {
        System.out.println(calculateBMI(76, 1.75));
    }

}