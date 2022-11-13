import java.util.*;

public class Javapedia {
  public static void main(String[] args) {
    System.out.println("*****JavaPedia******");
    System.out.println("How many historical figures will you register?");
    Scanner scan = new Scanner(System.in);
    int ansToRow = scan.nextInt();
    String [][] hist = new String[ansToRow][3];
    
    for(int i=0; i<ansToRow;i++){
      
      System.out.println("Figure "+(i+1));
      System.out.print("\tName: ");
      hist[i][0]= scan.next();
      scan.nextLine();
      System.out.print("\tDate of birthday: ");
      hist[i][1]= scan.next();
      System.out.print("\tOccupation: ");
      hist[i][2]= scan.next();
    }
    System.out.println("There are the values you stored: ");

    for(int i=0; i<ansToRow;i++){
      for(int j=0; j<3; j++){
        System.out.print(hist[i][j]+" ");
      }
      System.out.println("\n");
    }
    
    
    
  }
}
