import mangers.Manager;
import players.Player;
import teams.Team;
import teams.TeamService;

public class Main {
    public static void main(String[] args) {

        Player playerOne = new Player("Fin Russell","fly half", 10,10);

//        System.out.println(player.getName().toString());

        Manager manager = new Manager("tom");
        Team teamOne = new Team("s",manager);
        Manager managerRep = new Manager("dave");

        TeamService teamService = new TeamService();

        int spacesBefore = teamService.countEmptySpacesOnTeam(teamOne);
        System.out.println(spacesBefore);

        try {   //need a trycatch block if you have put an exception in methods signature.
            teamService.addPlayerToTeam(teamOne, playerOne);
        } catch (Exception e) {
            System.out.println("team is full");
        }

        int spacesAfter = teamService.countEmptySpacesOnTeam(teamOne);
        System.out.println(spacesAfter);

        teamService.replaceManager(teamOne, managerRep);
        System.out.println(teamOne);

    }
}
