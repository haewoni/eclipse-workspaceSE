package byte_stream.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		System.out.println("1.파일구분자:"+File.separatorChar);
		/*
		 * 기준경로(Base 경로)
		 *  - eclipse----> C:\Users\stu03\Desktop\JAVA_PYTHON\20.입출력[IO]
		 * 상대경로
		 *  - 기준경로를 기준으로 경로를 기술
		 * 절대경로
		 *  - C:,D: 드라이브 기준으로 경로를 기술
		 */
		File file1 = new File("io.pdf");
		//File file2 = new File("sample\\A.JDK_DOWNLOAD_URL.txt");
		File file2 = new File("sample/A.JDK_DOWNLOAD_URL.txt");
		File file3 = new File("sample","C.JAVA_COMPILE_RUN.txt");
		File file4 = new File("C:\\Users\\stu03\\Desktop\\JAVA_PYTHON\\20.입출력[IO]\\sample\\A.크롬다운로드URL.tx");
		
		System.out.println("2.file path:"+file1.getPath());
		System.out.println("2.file path:"+file2.getPath());
		System.out.println("2.file path:"+file3.getPath());
		System.out.println("2.file path:"+file4.getPath());


	}

}
