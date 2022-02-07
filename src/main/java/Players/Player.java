package Players;

import java.util.Objects;

public class Player {

    //Properties
    private String name;
    private String position;
       private int number;
         private int contractLength;

         //constructor
    public Player(String name, String position, int number, int contractLength){
        this.name = name;
        this.position = position;
        this.number = number;
        this.contractLength = contractLength;
    }
    //default constructor
    public Player(){

    }
    //getter and setters
    //encapsulation - properties from this class are only accessible from the methods made ie the getters and setters
    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public int getNumber(){
        return number;
    }
    public int getContractLength(){
        return contractLength;
    }

    public void setName (String name){
        this.name = name;
    }
    public void setPosition(String position){
        this.position = position;

    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setContractLength(int contractLength){
        this.contractLength = contractLength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number=" + number +
                ", contractLength=" + contractLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return number == player.number && contractLength == player.contractLength && Objects.equals(name, player.name) && Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, number, contractLength);
    }
}
