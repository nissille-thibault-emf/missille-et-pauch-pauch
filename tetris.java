public class tetris {
    public final static int HAUTEUR = 50 ;
    public final static int LARGEUR = 10 ;
    public static void main(String[] args) {


    }
    public static boolean[][] tetris_creer(int hauteur, int largeur) {
        boolean[][] quadrillage = new boolean[hauteur][largeur] ;
        return quadrillage ;
    }
    public static void go() {
        // Définir le look&feel visuel des fenêtres Swing
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);

        // Créer une instance du jeu et le démarrer
        tetris tetris = new tetris();
        tetris.start();
}
    }

    public void start() {
        // On crée une tâche qui va créer une fenêtre (notre LifeFrame) et le rendre
        // visible à l'écran
        // Ce LifeFrame contient le jPanel modifié qui affichera l'évolution du "jeu de
        // la vie"
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LifeFrame().setVisible(true);
            }
        });

    }