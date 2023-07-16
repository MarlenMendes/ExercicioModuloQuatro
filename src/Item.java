public class Item {

    // Definindo constantes para cada item
    public static final Item ARMAS = new Item("Armas", 100);
    public static final Item MUNICAO = new Item("Municao", 30);
    public static final Item AGUA = new Item("Agua", 5);
    public static final Item COMIDA = new Item("Comida", 15);

    private final String name;
    private final int value;

    // Construtor privado para que novas instâncias não possam ser criadas fora desta classe
    private Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static Object AGUA() {

        return null;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
