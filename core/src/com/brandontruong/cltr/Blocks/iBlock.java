package com.brandontruong.cltr.Blocks;

import com.badlogic.gdx.graphics.Color;
import com.brandontruong.cltr.Block;

/**
 * Created by btru on 5/6/15.
 */
public class iBlock extends Block {
    public final String type = "i";
    public final double attractiveness = 0.2;
    //public static final Color color = new Color(0.4f, 0.8f, 0.4f, 1);
    /**
     * Standard iBlock constructor.
     * @param x X position
     * @param y Y position
     */
    public iBlock(int x, int y){
        setColor(new Color(0.4f, 0.8f, 0.4f, 1));
        setX(x);
        setY(y);
        setSymbiosis(1);
    }

}