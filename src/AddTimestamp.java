import java.text.SimpleDateFormat;
import java.util.Date;

public class AddTimestamp {
    public String addTimestamp(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = sdf.format(new Date());
        return message + " | Дата та час: " + timestamp;
    }
}