package com.codewr.example.structural.adapter.pattern;

/**
 *
 * @author codewr
 */
public  class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            //mediaAdapter is providing support to play other file formats
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media ." + audioType + " format not supported");
        }
    }

    @Override
    public void pause(String audioType, String fileName) {
        //do something
    }

    @Override
    public void resume(String audioType, String fileName) {
       //do something
    }

    @Override
    public void stop(String audioType, String fileName) {
        //do something
    }

}
