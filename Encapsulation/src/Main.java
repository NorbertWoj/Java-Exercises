public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Norbi";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer norbi = new EnhancedPlayer("Norbi");
        System.out.println("initial health is " + norbi.healthRemaining());

    }
}