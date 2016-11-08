import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{   
    private String weapon;
    private int damage;
    private int fireRate;
    private int reloadTime;
    private int range;
    private int numProjectiles;
    
    public Weapon(String weapon, int damage, int fireRate, int reloadTime, int range)
    {
        this.weapon = weapon;
        this.damage = damage;
        this.fireRate = fireRate;
        this.reloadTime = reloadTime;
        spawnWeaponAtRandomLocation();
        // setWeaponImage();
    }
    
    public void setWeaponImage()
    {
        switch (weapon)
        {
            case "Pistol":
                this.setImage("pistol.png");
                break;
            case "SMG":
                this.setImage("smg.png");
                break;
            case "MG":
                this.setImage("MG.png");
                break;
            case "Shotgun":
                this.setImage("Shotgun.png");
                break;
            default:
                break;
        }
    }
    
    public int getDamage()
    {
        return this.damage;
    }
    
    public int getFireRate()
    {
        return this.fireRate;
    }
    
    public int getReloadTime()
    {
        return this.reloadTime;
    }

    private void spawnWeaponAtRandomLocation()
    {
        if (this.getWorld() != null)
            this.setLocation(this.getWorld().getWidth()/2, this.getWorld().getHeight()/2);
    }
}
