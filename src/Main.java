public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] heroes = {new Magic(), new Warrior(), new Medic(40)};
        for (HavingSuperAbility heroe : heroes) {
            heroe.applySuperAbility();
            if (heroe instanceof Medic) {
                Medic medic = (Medic) heroe;
                medic.increaseExperionce();
            }
        }
    }
}