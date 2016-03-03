import java.util.Scanner;
//TODO 教育担当授業
//テスト
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//if文の説明
		System.out.println("1から10の中で好きな数値を入れてください");
		Scanner scan = new Scanner(System.in);//ScannerクラスのnextIntを使って整数値を入力する
		int a = scan.nextInt();
		if(a>5){
			System.out.println("aは５より大きい:a>5");
		}
		else if(a>0){
			System.out.println("aは0以上かつ５以下です：a>0&&a<=5");
		}
		else{
			System.out.println("aは0以下です:a<=0");
		}


	}

}
