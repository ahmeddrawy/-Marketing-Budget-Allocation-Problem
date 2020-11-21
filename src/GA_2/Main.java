package GA_2;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt( sc.nextLine());
        int numberOfChannels =Integer.parseInt( sc.nextLine());
        String channels[] = new String[numberOfChannels];
        double ROI[] = new double[numberOfChannels];
        String lowers[] = new String[numberOfChannels];
        String uppers[] = new String[numberOfChannels];
        for (int i = 0; i <numberOfChannels ; i++) {
            String tmp = sc.nextLine();
                    String ins[]= tmp.split(" ");
            channels[i] = ins[0];
            ROI[i] = Double.parseDouble( ins[1]);
            System.out.println(channels[i]+ " _ "+ ROI[i]);
        }

        for (int i = 0; i < numberOfChannels; i++) {
            String ins[] = sc.nextLine().split(" ");
            lowers[i] = ins[0];
            uppers[i] = ins[1];
            System.out.println(lowers[i] +" -- " + uppers[i]);
        }
    }
}
