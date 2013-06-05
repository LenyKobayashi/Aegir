import java.util.Scanner;
import java.io.File;


class LireFichierTexte {
	
    public static void main(String[] arg)  throws Exception {
	
    	File file = new File ("regles.txt");
    	Scanner read = new Scanner (file);
    	while (read.hasNextLine()){
    		String line = read.nextLine();
    		System.out.println(line);
    	}
	

    }
}