import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import jakarta.persistence.Entity;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
    
    // Getters et setters
    // Méthode pour vérifier l'email
    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    // Méthodes de hashage et comparaison de mot de passe
    public void setPassword(String password) {
        this.password = hashPassword(password);
    }
    
    public boolean matchesPassword(String inputPassword) {
        return hashPassword(inputPassword).equals(this.password);
    }
    
    private String hashPassword(String password) {
        // Implémentez ici votre algorithme de hachage de mot de passe
        // Par exemple, vous pourriez utiliser BCrypt
        // return BCrypt.hashpw(password, BCrypt.gensalt());
        throw new UnsupportedOperationException("Méthode à implémenter");
    }
}

