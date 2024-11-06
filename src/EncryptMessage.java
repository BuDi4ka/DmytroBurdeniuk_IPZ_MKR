public class EncryptMessage {
    public String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}