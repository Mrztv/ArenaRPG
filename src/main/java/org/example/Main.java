package org.example;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра началась");
        System.out.println("Введите имя персонажа");
        PlayableCharacter player = new PlayableCharacter(input.next());
        System.out.println("Игровой персонаж создан:" + player.toString());


        while (true) {
            System.out.println("Начался первый этап: БОЙ");
            System.out.println("Фаза 1: Подбор противника ");
            System.out.println("Выберите противника:" + "\n" + "1)на уровень ниже" + "\n" + "2)того же уровня" + "\n" + "3)на уровень выше");
            int commend = input.nextInt();
            int lvlDifference;
            if (commend == 1) lvlDifference = -1;
            else if (commend == 2) lvlDifference = 0;
            else if (commend == 3) lvlDifference = 1;
            else {
                System.out.println("Error");
                return;
            }
            Random rand = new Random();
            int typeOfMob = rand.nextInt(4);
            Mob mobe = new Mob();
            if (typeOfMob == 1) {
                Goblinoid mob = (Goblinoid)mobe ;
            } else if (typeOfMob == 2) {
                Humanoids mob = new Humanoids(player.getLvlplayer() + lvlDifference);
            } else if (typeOfMob == 3) {
                Undead mob = new Undead(player.getLvlplayer() + lvlDifference);
            } else if (typeOfMob == 0) {
                Beastmen mob = new Beastmen(player.getLvlplayer() + lvlDifference);
            }

            System.out.println("Найден противник");
            System.out.println(mob.toString());
            System.out.println("Бой начался!");

        }















//        if (commend == 1) {
//            Goblinoid goblinoid = new Goblinoid(player.getLvlplayer() - 1);
//            System.out.println("Найден противник");
//            System.out.println(goblinoid.toString());
//            System.out.println("Бой начался!");
//            while (player.getPlayerHP() > 0 && goblinoid.getHPMob() > 0) {
//                System.out.println("Ход за вами, выберите действие:" + "\n" + "1)Атаковать" + "\n" + "2)Использовать навык" + "\n" + "3)использовать раходник");
//                int move = input.nextInt();
//                if (move == 1) {
//                    goblinoid.damageCurrentHealth(player.getStrengthplayer());
//                    System.out.println(player.getNameplayer() + " атаковал с силой " + player.getStrengthplayer() + " здоровье монстра упало до " + goblinoid.getHPMob());
//                    System.out.println("Гоблиноид контратакует!");
//
//                    player.damageCurrentHealth(goblinoid.getStrengthMob());
//                    System.out.println("Монстр атаковал с силой" + goblinoid.getStrengthMob() + " здоровье героя упало до " + player.getPlayerHP());
//                } else if (move == 2) {
//                } else if (move == 3) {
//                }
//            }
//
//
//
//
//        } else if (commend == 2) {
//            Humanoids humanoids = new Humanoids(player.getLvlplayer());
//            System.out.println("Найден противник");
//            System.out.println(humanoids.toString());
//            System.out.println("Бой начался!");
//            while (player.getPlayerHP() > 0 && humanoids.getHPMob() > 0) {
//                System.out.println("Ход за вами, выберите действие:" + "\n" + "1)Атаковать" + "\n" + "2)Использовать навык" + "\n" + "3)использовать раходник");
//                int move = input.nextInt();
//                if (move == 1) {
//                    humanoids.damageCurrentHealth(player.getStrengthplayer());
//                    System.out.println(player.getNameplayer() + " атаковал с силой " + player.getStrengthplayer() + " здоровье монстра упало до " + humanoids.getHPMob());
//                    System.out.println("Гоблиноид контратакует!");
//                    player.damageCurrentHealth(humanoids.getStrengthMob());
//                    System.out.println("Монстр атаковал с силой " + humanoids.getStrengthMob() + " здоровье героя упало до " + player.getPlayerHP());
//                } else if (move == 2) {
//                } else if (move == 3) {
//                }
//            }
//        }
//
//
//
//        else if (commend == 3) {
//            Beastmen beastmen = new Beastmen( player.getLvlplayer() + 1);
//            System.out.println("Найден противник");
//            System.out.println(beastmen.toString());
//            System.out.println("Бой начался!");
//            while (player.getPlayerHP() > 0 && beastmen.getHPMob() > 0) {
//                System.out.println("Ход за вами, выберите действие:" + "\n" + "1)Атаковать" + "\n" + "2)Использовать навык" + "\n" + "3)использовать раходник");
//                int move = input.nextInt();
//                if (move == 1) {
//                    beastmen.damageCurrentHealth(player.getStrengthplayer());
//                    System.out.println(player.getNameplayer() + " атаковал с силой " + player.getStrengthplayer() + " здоровье монстра упало до " + beastmen.getHPMob());
//                    System.out.println("Гоблиноид контратакует!");
//                    player.damageCurrentHealth(beastmen.getStrengthMob());
//                    System.out.println("Монстр атаковал с силой " + beastmen.getStrengthMob() + " здоровье героя упало до " + player.getPlayerHP());
//                } else if (move == 2) {
//                } else if (move == 3) {
//                }
//            }
//        }
    }
}
