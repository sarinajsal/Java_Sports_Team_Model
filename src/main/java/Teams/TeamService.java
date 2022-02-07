package Teams;

import Players.Player;

public class TeamService {

    public TeamService() {

    }


    //count empty spaces on team
    //return an int
    //parameters: Team

    public int countEmptySpacesOnTeam(Team team) {

        int count = 0;

        for (Player player : team.getPlayers()) { //for object, loop through this collection of objects
            if (player == null) {
                count++;
            }


        }
        return count;
    }
}


// example of using for i instead.

//                return count;
//        int count = 0;
//        Player[] playersOnTeam = team.getPlayers(); //extracting what we are looping over into a variable first
//        for (int i = 0; i < playersOnTeam.length; i++) {
//            if(playersOnTeam[i] == null){
//                count++;
//            }
//
//        }







