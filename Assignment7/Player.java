public class Player {
    private String name;
    private Weapon[] arsenal;
    private int currentWeaponIndex;

    public Player() {
        this("Default");
    }

    public Player(String name) {
        this.name = name;
        this.arsenal = new Weapon[]{new Knife(), new Sword(), new Pistol(), new Rifle()};
        this.currentWeaponIndex = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getCurrentWeapon() {
        return arsenal[currentWeaponIndex];
    }

    public int getCurrentWeaponIndex() {
        return currentWeaponIndex;
    }

    public String toString() {
        StringBuilder inventory = new StringBuilder();
        for (int i = 0; i < arsenal.length; i++) {
            inventory.append(arsenal[i].toString());
            if (i < arsenal.length - 1) {
                inventory.append(" | ");
            }
        }
        return "PLAYER: " + name + "\nCURRENT WEAPON: " + getCurrentWeapon().toString() +
                "\nINVENTORY: " + inventory.toString() + "\n";
    }

    public void cycleForward() {
        currentWeaponIndex = (currentWeaponIndex + 1) % arsenal.length;
    }

    public void cycleBackward() {
        currentWeaponIndex = (currentWeaponIndex - 1 + arsenal.length) % arsenal.length;
    }
}