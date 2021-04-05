package chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("Ex11.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("Ex11.bak");
			bw = new BufferedWriter(fw);
			
			String line = "";
			for(int i=1; line != null ; i++) {
				line = br.readLine();
				
				bw.write(i + " : " + line + "\n");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
