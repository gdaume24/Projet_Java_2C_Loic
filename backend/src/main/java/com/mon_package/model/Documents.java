import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "documents")
public class Documents {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;
    
    // Méthode pour vérifier le titre
    public boolean isValidTitle(String title) {
        return !title.trim().isEmpty();
    }
}