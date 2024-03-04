import java.util.*;

public class Election  {
    public static void main(String[] args) {
    int awbreyNY, awbreyNJ, awbreyCT;
    int martinezNY, martinezNJ, martinezCT;
    int totalMartinez, totalAwbrey, totalVotes;
    double percentAwbrey, percentMartinez;

    Scanner input = new Scanner (System.in);

    System.out.println("\nElection results from New York:");
    System.out.print("Awbrey:  "); 
    awbreyNY = input.nextInt();
    System.out.print("Martinez:");
    martinezNY = input.nextInt();

    System.out.println("\nElection results from New Jersey:");
    System.out.print("Awbrey:  "); 
    awbreyNJ = input.nextInt();
    System.out.print("Martinez:");
    martinezNJ = input.nextInt();

    System.out.println("\nElection results from Connecticut:");
    System.out.print("Awbrey:  "); 
    awbreyCT = input.nextInt();
    System.out.print("Martinez:");
    martinezCT = input.nextInt();

    totalMartinez = martinezNY + martinezNJ + martinezCT;
    totalAwbrey = awbreyNY + awbreyNJ + awbreyCT;
    totalVotes = totalMartinez + totalAwbrey;

    percentAwbrey = ((double)totalAwbrey/(double)totalVotes);
    percentMartinez = ((double)totalMartinez/(double)totalVotes);

    
    }

}