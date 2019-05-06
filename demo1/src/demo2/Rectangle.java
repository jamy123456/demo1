package demo2;

public class Rectangle {
	private int len1;
	private int len2;
	
	public Rectangle() {}
	
	public int getLen1() {
		return len1;
	}

	public void setLen1(int len1) {		
			if (len1 > 0) {	
				this.len1 = len1;
			}
	}

	public int getLen2() {
		return len2;
	}

	public void setLen2(int len2) {
			if (len2 > 0) {	
				this.len2 = len2;
			}
	}
	
	public int calArea(int len1, int len2) {
		if (len1 <= 0 || len2 <= 0) {
			return 0;
		}
		return (len1 + len2) * 2;
	}
}
