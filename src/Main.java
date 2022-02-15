public class Main {
    public static void main(String[] args) {

        int check = 100;
        int sum = 1000;
        int score;

        int bonus = 0;

        if (sum > 1000) bonus = sum / 100;

        score = check + sum + bonus;

        System.out.println("Итоговый счет:" + score);
        System.out.println("Бонусные рубли:" + bonus);


    }


}

