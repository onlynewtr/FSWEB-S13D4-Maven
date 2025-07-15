package org.example;

public class Main {
    public static void main(String[] args) {
       /* Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());*/

        Player player = new Player("emrah", 100, Weapon.AXE);
        System.out.println("healthRemaining: " + player.healthRemaining());


        Player player2 = new Player("hakan", 90, Weapon.SWORD);
        System.out.println("healthRemaining: " + player.healthRemaining());

        player.loseHealth(Integer.valueOf((int) (player2.getWeapon().getDamage() * player2.getWeapon().getAttackSpeed())));
        System.out.println("healthremaining after damage: " + player.healthRemaining());

        player.restoreHealth(70);
        System.out.println("healthremaining after restore: " + player.healthRemaining());
        player2.loseHealth((int) (player.getWeapon().getDamage() * player.getWeapon().getAttackSpeed()));
        System.out.println("health remaining after attack for player 2: " + player2.healthRemaining());


    }
}