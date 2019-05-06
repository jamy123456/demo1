package demo1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {
	public static void main(String[] args) {
		List<File> list = getData("D:\file");

		for (File file : list) {
			System.out.println(file.getName());
		}
	}

	@SuppressWarnings("unused")
	private static List<File> getData(String path) {
		List<File> list = new ArrayList<>();
		try {
			File file = new File(path);
			File[] fs = file.listFiles();
			int i = 0;
			while (i < file.length()) {
				if (fs[i].isDirectory()) {
					getData(fs[i].getPath());
				}
				if (fs[i].getName().endsWith(".java") || fs[i].getName().endsWith(".txt")
						|| fs[i].getName().endsWith(".avi")) {
					list.add(fs[i]);
				}
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
