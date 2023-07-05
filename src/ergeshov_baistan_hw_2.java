public class ergeshov_baistan_hw_2 {

    public static void test(int age, int temperature) {
        String result = canGoForAWalk(age, temperature);
        System.out.println("Возраст: " + age + ", Температура: " + temperature + " = " + result);
    }

    public static String canGoForAWalk(int age, int temp) {
        if ((age >= 20 && age <= 45) && (temp >= -20 && temp <= 30)) {
            return "Можно идти гулять";
        }else if ((age <= 20) && (temp >= 0 && temp <= 28)) {
            return "Можно идти гулять";
        }else if ((age >= 45) && (temp >= -10 && temp <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static void main(String[] args) {
        test(23, 10);
        test(75, 10);
        test(30, 35);
        test(50, 20);
        test(15, 5);
        System.out.println("");
        test(generateRandomAge(), 33);
        test(generateRandomAge(), 50);
        test(generateRandomAge(), 29);
        test(generateRandomAge(), 15);
        test(generateRandomAge(), -20);

    }
    public static int generateRandomAge(){
        int generate = (int) (Math.random()*100);
        return generate;
    }
}








