package byte_stream.char_stream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter(new FileWriter("printWriter.txt"));
		pw.print(2142134);
		pw.print(true);
		pw.print('문');
		pw.print('자');
		pw.print(23.2351);
		pw.print("문자열~~~~");
		pw.flush();
		pw.close();
		System.out.println("-----------PrintWriter.print-----------");

	}

}
