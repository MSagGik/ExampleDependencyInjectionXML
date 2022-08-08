package ru.msaggik.spring;

public class MusicPlayer {
    private Music music;

    // инверсия управления (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
