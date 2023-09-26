package org.example;
public class Goblinoid extends Mob {

    String nameMob="Goblinoid";
    public Goblinoid(int lvlMob) {
        this.lvlMob=lvlMob;

    }
    @Override
    public String toString() {
        return "Goblinoid{" +
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
