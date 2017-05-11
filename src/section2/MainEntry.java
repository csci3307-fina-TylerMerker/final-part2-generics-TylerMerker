package section2;

public class MainEntry {

	public static void main(String[] args) {
		MyGenInterface<Integer, String> mgi1;
		MyGenInterface<Integer,Integer> mgi2;
		mgi1 = new MyGenClass(1, "Tyler Merker");
		mgi2 = new MyGenClass(1, 2017);
		int i1 = MyRegularClass.getSum(10,20);
		float f1 = MyRegularClass.getSum(100f,200f);
		System.out.println("mgi1 key: " + mgi1.getKey() + " mgi1 value: " + mgi1.getValue());
		System.out.println("mgi2 key: " + mgi2.getKey() + " mgi2 value: " + mgi2.getValue());
		System.out.println("i1: " + i1 + "  f1: " + f1);
	}

}
