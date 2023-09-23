public class Medic extends Hero{
    private int healPoint;
    public void increaseExperionce(){
        healPoint += healPoint*0.1;
        System.out.println("Увеличил свой опыт лечения " + healPoint);
    }

    public Medic(int healPoint) {
        this.healPoint = healPoint;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic вылечил больного");
    }

}
