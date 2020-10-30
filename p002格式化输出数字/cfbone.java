package test;

public class cfbone {
	public static void main(String[] args) {
		// [1] 打印表名，表的名字前有8个空格
		// 字符串格式化 
		String s = String.format("%0" + 8 + "d", 0).replace("0", " ");
		System.out.println(s + "Multiplication Table");

		// [2] 打印表的第一行字段
		System.out.print("   ");
		for (int i=1; i<10; i++ ){
			System.out.printf("%4d", i);   // 占4个位置，右对齐
		}
		System.out.println();             // 换行

		// [4] 打印横线
		String line = String.format("%0" + 40 + "d", 0).replace("0", "-");
		System.out.println(line);
		
		// [4] 打印剩下的内容
		for (int i=1; i<=9; i++) {
			System.out.print(i + " |");
			for(int j=1; j<=9; j++) {
				System.out.printf("%4d", i * j);  
			}
			System.out.println();
		}
	}
}