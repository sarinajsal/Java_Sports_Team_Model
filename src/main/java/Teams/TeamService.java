package Teams;

import Players.Player;

public class TeamService {

    public TeamService(){

    }


    //count empty spaces on team
    //return an int
    //parameters: Team

    public int countEmptySpacesOnTeam(Team team){

        int count = 0;
//        for (int i = 0; i < team.getPlayers().length; i++) {
        for (Player player: team.getPlayers() ) {
            if (player == null){
                count++;
            }

        }
                return count;
        }
    }


