package debuging.dota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamCollector {

    public static DotaTeam greetTeam() {
        System.out.println("Приветствую новую команду! Представьте вашу команду, пожалуйста!");

        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();

        System.out.println("Введите членов команды, указав <имя пробел уровень_игры новая строка>, например: Дмитрий 1500. Чтобы закончить ввод введите 'всё'");

        String input = scanner.next();
        List<DotaUser> users = new ArrayList<>();

        do {
            String userName = input;
            int mmr = scanner.nextInt();

            users.add(new DotaUser(userName, mmr));

            input = scanner.next();
        } while (!input.equals("всё"));


        Float avgMmr = 0F;
        for (DotaUser user : users) {
            avgMmr = Float.valueOf(user.mmr);
        }

        avgMmr /= users.size();

        return new DotaTeam(users, teamName, avgMmr);
    }

}
