/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.entities.creatures.playerSkins;

import game.Handler;
import game.entities.creatures.Player;
import java.awt.image.BufferedImage;

/**
 *
 * @author nugal
 */
public abstract class PlayerSkinDecorator implements IPlayerSkin{
    protected IPlayerSkin skin = null;
    
    public BufferedImage draw()
    {
        return null;
//        return "super view " + skin.draw();
    }
    
    public PlayerSkinDecorator(IPlayerSkin skin)
    {
        this.skin=skin;
    }
}
