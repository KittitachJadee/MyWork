import java.util.Date;

public interface Expirable {
	boolean hasExpired(Date date);
}
