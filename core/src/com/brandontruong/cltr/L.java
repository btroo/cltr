package com.brandontruong.cltr;

import com.badlogic.gdx.Gdx;

/**
 * Created by btru on 6/3/15.
 */
public class L {
    public static void CLTR(String input){
        Gdx.app.log("CLTR", input);
    }

    public static void CLTR(int input){
        Gdx.app.log("CLTR", Integer.toString(input));
    }

    public static void CLTR(Double input){
        Gdx.app.log("CLTR", Double.toString(input));
    }

    public static void CLTR(Float input){
        Gdx.app.log("CLTR", Float.toString(input));
    }

    public static void CLTR(boolean input){
        Gdx.app.log("CLTR", Boolean.toString(input));
    }
}
