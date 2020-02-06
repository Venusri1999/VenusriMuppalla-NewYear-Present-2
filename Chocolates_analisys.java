package epam.com.maven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chocolates_analisys {
	public static int tw_choco = 0;
	public static int tc_choco = 0;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Size of BarOne = Large\nSize of Perk = Small");
    	BarOne b = new BarOne();
    	Perk sn = new Perk();
    	
    	System.out.println("Enter size of BarOne(1 to 10): ");
    	b.getsize(scan.nextInt());
    	
    	System.out.println("Enter size of Perk (1 to 10): ");
    	sn.getsize(scan.nextInt());
    	
    	System.out.println("Enter quantity of BarOne: ");
    	int dq = scan.nextInt();
    	
    	System.out.println("Enter quantity of Perk: ");
    	int sq = scan.nextInt();
    	
    	System.out.println("Enter price of BarOne: ");
    	b.price = scan.nextInt();
    	
    	System.out.println("Enter price of Perk: ");
    	sn.price = scan.nextInt();
    	
    	
    	System.out.println("Sort By Option:");
    	System.out.println("1.Size\n2.Name\nEnter your choice: ");
    	int op = scan.nextInt();
    	int dm = b.display();
    	int ss = sn.display();
    	ArrayList<String> ch = new ArrayList<String>();
    	if(op==1) {
    		if(dm>ss){
        		ch.add("BarOne");
        		ch.add("Perk");
        	}
        	else{
        		ch.add("Perk");
        		ch.add("BarOne");
        	}
        	System.out.println(ch+"\n\n");
    	}
    	else if(op==2) {
    		ch.add("Perk");
    		ch.add("BarOne");
    		Collections.sort(ch);
    		System.out.println(ch);
    	}
    	else {
    		System.out.println("Invalid Input");
    		return;
    	}
    	
    	tw_choco = b.total_w(dq) + sn.total_w(sq);
    	System.out.println(tw_choco +" Grms");
    	
    	tc_choco = b.total_p(dq) + sn.total_p(sq);
    	System.out.println(tc_choco +" Rc.");
	}
	
}


