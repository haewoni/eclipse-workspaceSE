package byte_stream.filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("bufferedOut.txt");  //노드 스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos);  //필터 스트림
		
		for (int i = 0; i < args.length; i++) {
			bos.write(i);
			
		}
		/*
		 * Flushes this output stream and forces any buffered output bytes be written out
		 */
		bos.flush(); 
		bos.close();
		System.out.println("bufferdOut.txt---->write");
		
		BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream("bufferedOut.txt"));
		while(true) {
			int readByte = bis.read();
			if(readByte==-1)break;
			System.out.println((char)readByte);
		}
		bis.close();
		System.out.println();
		System.out.println("bufferedOut.txt --> read");

	}

}
