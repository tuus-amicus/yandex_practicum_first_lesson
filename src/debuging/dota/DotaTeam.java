package debuging.dota;

import java.util.List;

public class DotaTeam {
    public List<DotaUser> users;

    public String name;
    public Float avgMmr;

    public DotaTeam(List<DotaUser> users, String name, Float avgMmr) {
        this.users = users;
        this.name = name;
        this.avgMmr = avgMmr;
    }
}
