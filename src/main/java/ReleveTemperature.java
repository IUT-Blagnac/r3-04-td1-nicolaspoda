
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
import java.util.Scanner;
public class ReleveTemperature
{
    public static void main() {

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

    /**
    *Permet de faire la moyenne des températures
    *@param nbTemperatures IN : le nombre de températures
    *@param tab IN : tableau contenant les températures
    *@return la moyenne des températures
     */
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

    /**
    *Permet de trouver la température minimale
    *@param nbTemperatures IN : le nombre de températures
    *@param tab IN : tableau contenant les températures
    *@return la température minimale
    */
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

    /**
    *Permet de trouver la température maximale
    *@param nbTemperatures IN : le nombre de températures
    *@param tab IN : tableau contenant les températures
    *@return la température maximale
    */
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

    /**
    *Permet de trouver le nombre d'occurences d'une température
    *@param nbTemperatures IN : le nombre de températures
    *@param tab IN : tableau contenant les températures
    *@param temperature IN : la température dont on veut avoir le nombre d'occurences
    */
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