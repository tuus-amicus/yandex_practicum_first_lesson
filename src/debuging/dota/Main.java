package debuging.dota;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int teamNo = 1;

    public static void main(String[] args) {
        final ArrayList<DotaTeam> teams = new ArrayList<>();

        for(int i = 0; i < 2; i++ ) {
            DotaTeam dotaTeam = TeamCollector.greetTeam();
            teams.add(dotaTeam);
            introduceTeam(dotaTeam);
        }

        defineWinner(teams);
    }

    private static void introduceTeam(DotaTeam dotaTeam) {
        System.out.printf("Команда №%d: %s, выступает в следующем составе: %n", dotaTeam.name, teamNo);
        for (DotaUser user : dotaTeam.users) {
            System.out.printf("%s, ", user.name);
            System.out.println();
        }

        teamNo += 1;
    }

    private static void defineWinner(List<DotaTeam> teams) {
        DotaTeam first = teams.get(0);
        DotaTeam second = teams.get(2);

        float ratio;
        if (first.avgMmr > second.avgMmr) {
            ratio = first.avgMmr / second.avgMmr;
        } else {
            ratio = second.avgMmr / first.avgMmr;
        }

        System.out.printf("Команда 1 выиграет с коэффициентом %f %n", ratio);
    }
}
