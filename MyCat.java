import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    protected boolean alone = true;
    protected boolean tired = true;
    protected boolean hungry = true;
    protected boolean bored = true;
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        if(this.alone == true){
            sleep(2);
            shoutHooray();
            this.tired = false;
        }
        if(this.tired == true){
            sleep(2);
            shoutHooray();
            this.tired = false;
        }
        else{
            shoutHooray();
        }
        if(this.hungry == true){
            eat();
            this.hungry = false;
        }
        if(this.bored == true){
            dance();
            this.bored = false;
        }
    }
    /**
     * Reproduces a pattern: dance, sleep(2), walkRight(5) and walkLeft(5);
     */
    public void routine(){
        dance();
        sleep(2);
        walkRight(5);
        walkLeft(5);
    }
}
