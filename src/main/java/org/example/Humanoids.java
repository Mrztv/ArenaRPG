package org.example;
public class Humanoids extends Mob {
    String nameMob="Humanoids";
    public Humanoids(int lvlmob){
    this.lvlMob=lvlmob;
    }
    @Override
    public String toString() {
        return "Humanoids{" +
                " nameMob='" + nameMob + '\'' +
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
