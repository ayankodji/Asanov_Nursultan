public class Main {
    public static void main(String[] args) {


        System.out.println(checkWeather(25, 10)); // можно идти гулять
        System.out.println(checkWeather(18, 20)); // можно идти гулять
        System.out.println(checkWeather(50, 5)); // можно идти гулять
        System.out.println(checkWeather(30, 35)); // оставайтесь дома
        System.out.println(checkWeather(40, 15)); // можно идти гулять
    }



    public static String checkWeather(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "можно идти гулять";
        } else if ((age < 20) && (temperature >= 0 && temperature <= 28)) {
            return "можно идти гулять";
        } else if ((age > 45) && (temperature >= -10 && temperature <= 25)) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }
}