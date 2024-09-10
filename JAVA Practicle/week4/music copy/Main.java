package music;

public class Main {
    public static void main(String[] args) {
        // Using Local File Player
        LocalFilePlayer localFilePlayer = new LocalFilePlayer();
        MusicSource localSource = new LocalFileAdapter(localFilePlayer);

        // Basic Music Player
        MusicPlayer basicPlayer = new BasicMusicPlayer(localSource);
        basicPlayer.play();
        basicPlayer.pause();
        basicPlayer.stop();

        // Enhanced Music Player with Equalizer and Volume Control
        MusicPlayer enhancedPlayer = new VolumeControlDecorator(new EqualizerDecorator(basicPlayer));
        enhancedPlayer.play();
        enhancedPlayer.pause();
        enhancedPlayer.stop();
    }
}

