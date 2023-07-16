import java.util.ArrayList;
import java.util.List;

public class RebelBase {
    private final List<Rebel> rebels;

    public RebelBase() {
        this.rebels = new ArrayList<>();
    }

    public void addRebel(Rebel rebel) {
        this.rebels.add(rebel);
    }

    public void updateRebelLocation(String name, String newLocation) {
        for (Rebel rebel : rebels) {
            if (rebel.getName().equals(name)) {
                rebel.setLocation(newLocation);
                break;
            }
        }
    }

    public void reportTreason(String name) {
        int reportCount = 0;
        for (Rebel rebel : rebels) {
            if (rebel.getName().equals(name)) {
                rebel.increaseTreasonReport();
                reportCount = rebel.getTreasonReport();
                if(reportCount >= 3) {
                    rebel.setTraitor(true);
                }
                break;
            }
        }
    }

    public double getPercentageTraitors() {
        long count = rebels.stream().filter(Rebel::isTraitor).count();
        return (double) count / rebels.size() * 100;
    }

    public double getPercentageRebels() {
        return 100 - getPercentageTraitors();
    }
}
