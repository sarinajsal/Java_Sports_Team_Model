package teams;

import mangers.Manager;
import players.Player;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TeamServiceTest {

    @Test //first thing to do is @Test annotation - flags up to junit that this code is a test, run it as a test
    public void canCountEmptySpacesOnTeamWhenEmpty(){ //needs to be void
        //given
        Manager manager = new Manager("test manager");
        Team team = new Team("team1",manager);
        TeamService underTest = new TeamService(); //need an instance of teamservice which is being tested.

        //when
        int actual = underTest.countEmptySpacesOnTeam(team); //need to keep in a varaible

        //then
        int expected = 15;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canCountEmptySpacesOnTeamWithOnePlayer(){
        //given
        Manager manager = new Manager("test manager");
        Team team = new Team("test rfc", manager);
        Player player = new Player("test player", "wing", 11, 2);
        TeamService underTest = new TeamService();

       team.getPlayers()[0] = player;

        //when

        int actual = underTest.countEmptySpacesOnTeam(team);

        //then
        int expected = 14;
        assertThat(actual).isEqualTo(expected);

    }


}
