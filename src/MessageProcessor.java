import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageProcessor {
    public static void main(String[] args) {
        String message = "Lorem ipsum dolor      sit amet, consectetur";

        EncryptMessage encryptMessage = new EncryptMessage();
        message = encryptMessage.encrypt(message);
        System.out.println("Після шифрування: " + message);

        CompressMessage compressMessage = new CompressMessage();
        message = compressMessage.compress(message);
        System.out.println("Після стиснення: " + message);

        AddTimestamp addTimestamp = new AddTimestamp();
        message = addTimestamp.addTimestamp(message);
        System.out.println("Після додавання дати та часу: " + message);

        AddAuthor addAuthor = new AddAuthor();
        message = addAuthor.addAuthor(message);
        System.out.println("Після додавання автора: " + message);
    }
}