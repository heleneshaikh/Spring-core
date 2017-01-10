package guru.springframework.services.security;

/**
 * Created by heleneshaikh on 09/01/2017.
 */
public interface EncryptionService {
    String encryptString(String input);
    boolean checkPassword(String plainPassword, String encryptedPassword);
}
