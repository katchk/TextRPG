package textrpg.jobs;

import textrpg.Player;

public class Warrior implements job //extends Player???
{
    Player hero = new Player();
    
    public Warrior(Player p){hero = p;}//gets the player object
    
    public int attack()
    {
        return (int)(hero.getStrength() * .3) + 50;
    }
}
