package com.codewr.example.structural.adapter.pattern;

/**
 *
 * @author codewr
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4: " + fileName);
    }
}
