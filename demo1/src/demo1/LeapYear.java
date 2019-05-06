package demo1;

public class LeapYear {
	public static void main(String[] args) {//判断闰年
       int year = 2015;
       if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
    	   System.out.println(year+"年为闰年");
       }else {
    	   System.out.println(year+"年不是闰年");
       }
	}
}
