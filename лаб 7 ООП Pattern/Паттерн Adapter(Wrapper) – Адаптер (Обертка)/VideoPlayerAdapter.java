// Адаптер, который преобразует вызовы методов целевого интерфейса в вызовы методов адаптируемого класса
class VideoPlayerAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public VideoPlayerAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String fileName) {
        videoPlayer.playVideo(fileName);
    }
}