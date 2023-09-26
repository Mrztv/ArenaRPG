package org.example;

public class Undead extends Mob{
    String nameMob="Undead";
    public Undead(int lvlMob) {
    this.lvlMob=lvlMob;
    }
    @Override
    public String toString() {
        return "Undead{" +
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


