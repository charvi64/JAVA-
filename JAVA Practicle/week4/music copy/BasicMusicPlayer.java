package music;

public class BasicMusicPlayer implements MusicPlayer {
    private MusicSource musicSource;

    public BasicMusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.play();
    }

    @Override
    public void pause() {
        musicSource.pause();
    }

    @Override
    public void stop() {
        musicSource.stop();
    }
}

