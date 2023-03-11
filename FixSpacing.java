import java.io.*;
import java.util.*;
class FixSpacing {
  public static void main(String[] args) throws FileNotFoundException {
  Scanner scan = new Scanner(new File("FixSpacing.txt"));
    fixSpacing(scan);
  }
public static void fixSpacing(Scanner wordFinder)throws FileNotFoundException{
  PrintStream out = new PrintStream(new File("FixedSpacing.txt"));
  String line = "";
while(wordFinder.hasNextLine()){ 
  line = wordFinder.nextLine();
  Scanner scans = new Scanner(line);
  while (scans.hasNext()) {
	String word = scans.next();
    out.print(word+" ");
  }
  out.println();
}

  System.out.println("FixedSpacing.txt");

}
  
}