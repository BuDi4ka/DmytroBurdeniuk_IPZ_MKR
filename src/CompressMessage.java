public class CompressMessage {
    public String compress(String message) {
        return message.replaceAll("\\s+", " ").trim();
    }
}