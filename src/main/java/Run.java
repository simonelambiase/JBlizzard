import online.ferlow.jblizzard.JBlizzardClient;
import online.ferlow.jblizzard.entity.constants.Locale;

public class Run {
    public static void main(String[] args) {
        JBlizzardClient jbcl = new JBlizzardClient(args[0], args[1], Locale.IT_IT);
        System.out.println(jbcl.getEuRegion().getAchievements().size());
    }
}
