package org.example;

public class Beastmen extends Mob {
    String nameMob="Goblinoid";
    public Beastmen(int lvlMob) {
        this.lvlMob=lvlMob;
    }

    @Override
    public String toString() {
        return "Beastmen{" +
                "nameMob='" + nameMob + '\'' +
                ", strengthMob=" + strengthMob +
                ", dexterityMob=" + dexterityMob +
                ", staminaMob=" + staminaMob +
                ", HPMob=" + HPMob +
                ", energyMob=" + energyMob +
                ", lvlMob=" + lvlMob +
                ", defenseMob=" + defenseMob +
                '}';
    }
}
