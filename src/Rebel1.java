import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Rebel1 {
}

class Rebel {
    private Object name;
    private int age;
    private String gender;
    private String location;
    private boolean isTraitor;
    Map<String, Integer> inventory;
    private Object List;
    private Object util;
    private boolean traitor;

    public Rebel(String name, int age, String gender, String location, Map<String, Integer> inventory) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.inventory = inventory;
        this.isTraitor = false;
    }

    public void setTraitor() {
        Object list1 = List;
        Object list = list1;
        Object list11 = list1;

        class RebelBase {
            private List<Rebel> rebels;

            public RebelBase() {
                this.rebels = new ArrayList<>();
            }

            public void addRebel(Rebel rebel) {
                this.rebels.add(rebel);
            }

            public void updateRebelLocation(String name, String newLocation) {
                for (Rebel rebel : rebels) {
                    if (Objects.equals(rebel.getName(), name)) {
                        rebel.setLocation(newLocation);
                        break;
                    }
                }
            }

            public void reportTraitor(String name) {
                for (Rebel rebel : rebels) {
                    if (!rebel.getName().equals(name)) {
                        continue;
                    }
                    rebel.setTraitor(true);
                    break;
                }
            }

            public double getPercentageTraitors() {
                int count = 0;
                for (Rebel rebel : rebels) {
                    if (rebel.isTraitor()) {
                        int i = count++;
                    }
                }
                return (double) count / rebels.size() * 100;
            }

            public double getPercentageRebels() {
                return 100 - getPercentageTraitors();
            }

            // getters and setters aqui
        }
        boolean b = false;
    }

    boolean isTraitor() {
        boolean b = false;
        return b;
    }

    protected void setLocation(String newLocation) {
    }

    void setTraitor(boolean b) {
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public JComboBox<Object> getInventory() {

        return null;
    }

    public void updateLocation(String base2) {
    }

    public void increaseTreasonReport() {
    }

    public int getTreasonReport() {
        return 0;
    }
}

    
