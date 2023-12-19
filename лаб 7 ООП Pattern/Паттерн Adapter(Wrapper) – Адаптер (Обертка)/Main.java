// Пример использования
public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("song.mp3");

        VideoPlayer videoPlayer = new VideoPlayer();
        MediaPlayer videoPlayerAdapter = new VideoPlayerAdapter(videoPlayer);
        videoPlayerAdapter.play("movie.mkv");
    }
}