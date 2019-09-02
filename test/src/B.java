import java.util.Scanner;

/**
 * @Description: 排列
 * @author: liusen
 * @date: 2018年12月25日 下午2:05:15
 * @version V2.0
 */
public class B {
	static int count = 0;
	public static void main(String[] args) {
		System.out.println("please input a String:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		B p = new B();
		System.out.println(str + "出现的所有排列如下：");
		p.permute(str);
		System.out.println();
		System.out.println("总共有" + count + "种排列");
	}

	private void permute(String str) {
		this.permute(str.toCharArray(), 0, str.length() - 1);
	}

	// 从最后一个位置向前，依次对每个位置上可能出现的字符进行确定(如字符数组是{a,b,c,d},那么最后一个位置可能出现4种情况，确定好第四位置上的字符后，第三个位置可能出现三种情况依次类推)
	private void permute(char[] charArray, int low, int high) {
		int i;
		if (high == low) { // 如果是到了第一个位置(low是第一个位置的索引)，或者只有一个字符，那么应该输出此字符串
			String str = "";
			for (i = 0; i < charArray.length; i++) {
				str += charArray[i];
			}
			System.out.print(str + " ");
			count++;
		} else {
			for (int j = low; j <= high; j++) {  // 将某个位置上可能出现的字符进行遍历(如最后一个位置可能出现high+1种情况)
				for (i = low; i < high; i++) {   // 将第low位置上的字符移到第high位置上
					char temp = charArray[i];
					charArray[i] = charArray[i + 1];
					charArray[i + 1] = temp;
				}
				permute(charArray, low, high - 1); // 当第high位置上的字符确定后，就应该确定第high-1位置上的字符。
			}
		}
	}
}
