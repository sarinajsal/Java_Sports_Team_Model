import Mangers.Manager;
import Players.Player;
import Teams.Team;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Fin Russell","fly half", 10,10);

        System.out.println(player.getName().toString());

        Manager manager = new Manager("tom");
        Team team = new Team("s",manager);

    }
}
