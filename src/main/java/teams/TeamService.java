package teams;

import players.Player;

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

    }

    public void addPlayerToTeam (Team team, Player player) throws Exception {  //need to add exception to method signature
        //check if there is an empty space on the team
        int spaces = countEmptySpacesOnTeam(team);
        //if there is an empty space, add the player
        if(spaces > 0){
            //get the players array from team
            Player[] storingPlayers = team.getPlayers();

            //add player to first available empty space
            //loop through players array
            for (int i = 0; i < storingPlayers.length; i++) {

                //if we find an empty space, add the player then break

                if(storingPlayers[i] == null){
                    storingPlayers[i] = player;
                    break;
                }

                }
            }
            else {
                throw new Exception(); //could throw illegalstate exception instead down here, dont need to add to methods signature

        }

    }


}










