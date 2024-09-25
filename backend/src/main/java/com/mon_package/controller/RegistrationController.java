import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    @Value("${SECRET_KEY}")
    private String secretKey;

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public RegistrationController 
        (UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;



    // Création et sauvegarde de l'utilisateur dans la base de données
    // User user = new User( encodedPassword);
    // userRepository.save(user);

    }
}

