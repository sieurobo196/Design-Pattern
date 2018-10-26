package com.codewr.example.structural.adapter.pattern;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "that girl.mp3");
        audioPlayer.play("mp4", "25 minutes.mp4");
        audioPlayer.play("vlc", "why not me.vlc");
        audioPlayer.play("avi", "i cry.avi");

    }

    
}
