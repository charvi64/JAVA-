package music;

public class VolumeControlDecorator implements MusicPlayer {
    private MusicPlayer musicPlayer;

    public VolumeControlDecorator(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.play();
        System.out.println("Adjusting volume level.");
    }

    @Override
    public void pause() {
        musicPlayer.pause();
    }

    @Override
    public void stop() {
        musicPlayer.stop();
    }
}

