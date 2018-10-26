package com.codewr.example.structural.adapter.pattern;

/**
 *
 * @author codewr
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
