
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
import java.util.Scanner;
public class ReleveTemperature
{
    public static void principale() {

        Scanner clavier = new Scanner(System.in);
        System.out.println ("Entrez un nombre de températures");
        int nbTemperatures = clavier.nextInt();
        double tabTemperatures[];
        tabTemperatures = new double [60];
        System.out.println ("Entrez une température dont vous cherchez les occurences");
        double temperature = clavier.nextDouble();

        int i = 0;

        for (i = 0; i < nbTemperatures; i = i+1) {
            System.out.println ("Entrez une température");
            tabTemperatures[i] = clavier.nextDouble();
        }
        double moyenneTemperatures;
        moyenneTemperatures = 0;

        if (nbTemperatures > 0) {
            moyenneTemperatures = moyenne (nbTemperatures, tabTemperatures);
            System.out.println ("La moyenne des températures est de :" + moyenneTemperatures);
        }
        double maxTemperature;
        maxTemperature = 0;
        if (nbTemperatures > 0) {
            maxTemperature = max (nbTemperatures, tabTemperatures);
            System.out.println ("La température maximale est de : " + maxTemperature);
        }
        double minTemperature;
        minTemperature = 0;
        if (nbTemperatures > 0) {
            minTemperature = min (nbTemperatures, tabTemperatures);
            System.out.println ("La température minimale est de " + minTemperature);
        }
        int occurences = 0;

        if (nbTemperatures > 0) {
            occurences = nbOccurences (nbTemperatures, tabTemperatures, temperature);
            System.out.println (nbTemperatures + "saisies de températures ont été effectuées");
            System.out.println ("Le nombre d'occurences que vous cherchiez est de" + occurences);
        }
    }

    public static double moyenne(int nbTemperatures, double tab []) {
        double somme = 0;
        double moyenne = 0;
        int i = 0; 
        for (i = 0; i < nbTemperatures; i = i+1) {
            somme = somme + tab[i];
        }
        moyenne = somme/nbTemperatures;
        return (moyenne);
    }

    public static double min (int nbTemperatures, double tab []) {
        int i;
        i = 0;
        double temperatureBasse = tab [i];
        for (i = 0; i < nbTemperatures; i = i +1) {
            if (tab [i] < temperatureBasse) {
                temperatureBasse = tab [i];

            }

        }
        return temperatureBasse;
    }

    public static double max (int nbTemperatures, double tab []) {
        int i;
        double temperatureHaute = 0;
        for (i = 0; i < nbTemperatures; i = i+1) {
            if (tab [i] > temperatureHaute) {
                temperatureHaute = tab[i];

            }

        }
        return temperatureHaute;
    }

    public static int nbOccurences (int nbTemperatures, double tab [], double temperature) {

        int occurences = 0;

        for (int i = 0; i < nbTemperatures; i = i + 1) {
            if (tab[i] == temperature) {
                occurences = occurences + 1;
            }

        }
        return occurences;  
    }
}