import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RebelBase rebelBase = new RebelBase();
        Rebel rebel1 = new Rebel("Luke", 20, "M", "Base1", new Inventory());
        Rebel rebel2 = new Rebel("Leia", 19, "F", "Base1", new Inventory());
        Rebel rebel3 = new Rebel("Han", 29, "M", "Base1", new Inventory());
        Rebel rebel4 = new Rebel("Chewbacca", 200, "M", "Base1", new Inventory());
        Rebel rebel5 = new Rebel("Anakin", 46, "M", "Base1", new Inventory());

        rebelBase.addRebel(rebel1);
        rebelBase.addRebel(rebel2);
        rebelBase.addRebel(rebel3);
        rebelBase.addRebel(rebel4);
        rebelBase.addRebel(rebel5);

        // Adicionar recursos a um rebelde
        rebel1.getInventory().addItem(Item.ARMAS);
        rebel1.getInventory().addItem(Item.MUNICAO);
        rebel1.getInventory().addItem(Item.AGUA);

        // Atualizar a localização de um rebelde
        rebelBase.updateRebelLocation(rebel1.getName(), "Base2");

        // Reportar um rebelde como traidor
        rebelBase.reportTreason(rebel5.getName());

        // Verificar se um rebelde é um traidor
        if (rebel5.isTraitor()) {
            System.out.println(rebel5.getName() + " é um traidor");
        } else {
            System.out.println(rebel5.getName() + " não é um traidor");
        }

        // Gerar relatórios
        System.out.println("Percentual de traidores: " + rebelBase.getPercentageTraitors() + "%");
        System.out.println("Percentual de rebeldes: " + rebelBase.getPercentageRebels() + "%");

        // Implementação do sistema de compras não está incluída neste exemplo
    }

    private static class Inventory {
        private final Map<Item, Integer> items;

        public Inventory() {
            this.items = new HashMap<>();
        }

        public void addItem(Item item) {
            Integer count = items.getOrDefault(item, 0);
            items.put(item, count + 1);
        }
    }

    private static class RebelBase {
        private final Map<String, Rebel> rebels;

        public RebelBase() {
            this.rebels = new HashMap<>();
        }

        public void addRebel(Rebel rebel) {
            rebels.put(rebel.getName(), rebel);
        }

        public void updateRebelLocation(String rebelName, String newLocation) {
            Rebel rebel = rebels.get(rebelName);
            if (rebel != null) {
                rebel.setLocation(newLocation);
            }
        }

        public void reportTreason(String rebelName) {
            Rebel rebel = rebels.get(rebelName);
            if (rebel != null) {
                rebel.setTraitor(true);
            }
        }

        public double getPercentageTraitors() {
            int totalRebels = rebels.size();
            int traitorCount = 0;

            for (Rebel rebel : rebels.values()) {
                if (rebel.isTraitor()) {
                    traitorCount++;
                }
            }

            return (double) (traitorCount * 100) / totalRebels;
        }

        public double getPercentageRebels() {
            return 100 - getPercentageTraitors();
        }
    }

    private static class Rebel {
        private final String name;
        private final int age;
        private final String gender;
        private String location;
        private boolean traitor;
        private final Inventory inventory;

        public Rebel(String name, int age, String gender, String location, Inventory inventory) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.location = location;
            this.inventory = inventory;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public boolean isTraitor() {
            return traitor;
        }

        public void setTraitor(boolean traitor) {
            this.traitor = traitor;
        }

        public Inventory getInventory() {
            return inventory;
        }
    }

    private static class Item {
        public static final Item ARMAS = new Item("Armas");
        public static final Item MUNICAO = new Item("Munição");
        public static final Item AGUA = new Item("Água");

        private final String name;

        private Item(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
