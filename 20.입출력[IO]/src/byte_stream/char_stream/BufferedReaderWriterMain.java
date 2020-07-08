package byte_stream.char_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterMain {

	public static void main(String[] args) throws Exception  {

		BufferedReader br = new BufferedReader(new FileReader("00.VariableDeclare.txt "));
		BufferedWriter bw = new BufferedWriter(new FileWriter("00.VariableDeclare_LineNumber.txt"));		
		int lineNo = 0 ;
		while(true) {
			String readLine = br.readLine();
			if(readLine==null)break;
			lineNo++;
			bw.write(lineNo+":"+readLine);
			//bw.write("\n");
			bw.newLine();
			
		}
		bw.flush();
		bw.close();
		System.out.println();

	}

}
