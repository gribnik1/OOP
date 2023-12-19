
// Класс конкретной реализации целевого интерфейса
class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Играет аудио файл: " + fileName);
    }
}