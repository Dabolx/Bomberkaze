/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.entities.creatures.playerSkins;

import game.Handler;
import game.entities.creatures.Player;
import game.gfx.Assets;
import java.awt.image.BufferedImage;

/**
 *
 * @author nugal
 */
public class BlueSkin extends PlayerSkinDecorator {
    
    public BlueSkin(IPlayerSkin skin) {
        super(skin);
    }
    public BufferedImage draw()
    {
      return Assets.player;
    }
    
    
    
}
