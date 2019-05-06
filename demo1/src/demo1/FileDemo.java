package demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File file1 = new File("d:/mymusic.mp4");
		File file2 = new File("e:/disport/mymusic.mp4");
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			byte[] b = new byte[(int) file1.length()];
			fis.read(b);
			fos.write(b);
			System.out.println("复制完毕!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				fos.close();
			}
			if (fis != null) {
				fis.close();
			}
		}
	}
}
