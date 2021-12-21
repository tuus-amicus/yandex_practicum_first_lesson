package debuging.dota;

public class DotaUser {
    public String name;
    public Integer mmr;

    public DotaUser(String name, Integer mmr) {
        this.name = name;
        this.mmr = mmr;
    }

    @Override
    public String toString() {
        return "DotaUser{" +
                "name='" + name + '\'' +
                ", mmr=" + mmr +
                '}';
    }
}
