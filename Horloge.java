import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Horloge extends JFrame {
    
    private JLabel label; // Étiquette pour afficher l'heure
    
    public Horloge() {
        // Configuration de la fenêtre
        setTitle("Horloge en Direct");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrer la fenêtre à l'écran
        
        label = new JLabel("", JLabel.CENTER); // Créer une étiquette centrée
        label.setFont(new Font("Serif", Font.PLAIN, 30)); // Définir la police et la taille du texte
        add(label); // Ajouter l'étiquette à la fenêtre
        
        // Créer un timer qui met à jour l'heure chaque seconde
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    // Méthode pour mettre à jour l'heure
    private void updateTime() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss"); // Format de l'heure
        Date date = new Date(); // Obtenir l'heure actuelle
        label.setText(format.format(date)); // Afficher l'heure
    }

    // Méthode principale pour exécuter le programme
    public static void main(String[] args) {
        // Créer une instance de l'application et la rendre visible
        SwingUtilities.invokeLater(() -> {
            Horloge horloge = new Horloge();
            horloge.setVisible(true);
        });
    }
}
