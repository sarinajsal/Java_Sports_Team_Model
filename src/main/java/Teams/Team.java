package Teams;

import Mangers.Manager;
import Players.Player;

public class Team {
    private Player[] players; //dont need to put size in yet, should be in constructor
    private String name;
    private Manager manager;

    public Team(String name, Manager manager){
        this.name = name;
        this.manager = manager;
        this.players = new Player[15];
    }
    public Team(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Manager getManager(){
        return  manager;
    }
    public void setManager(Manager manager){
        this.manager = manager;
    }
    public Player[] getPlayers(){
        return players;
    }
    public void setPlayers(Player[] players){
        this.players = players;
    }

}
