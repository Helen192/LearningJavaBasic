package lessonn6.string.arraylist;

public class lyThuyetString {
	public static void main(String[] args) {
		String content = "huong phuong nguyen";
		// tra ve index dau tiên cua 1 ky tu nao do trong 1 String
		System.out.println("Index of e: " + content.indexOf("e"));
		// tra ve index cuoi cua 1 ky tu nao do trong 1 String
		System.out.println("Last index of o: " + content.lastIndexOf("o"));
		
		// cat 1 chuoi ra khoi 1 chuoi va show chuoi sau khi cat ra
		String number = "12345623789";
		String[] afterSplit = number.split("23");
		for(String num : afterSplit) {
			System.out.println(num);
		}
		
		
		// Cach khai bao chuoi(quuan ly) trong java
		// 1 chuoi >> noi cac chuoi lai 
		// StringBuilder va StringBuffer
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append(" World");
		builder.append('!');
		builder.append(2020);
		System.out.println(builder.toString());
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello");
		buffer.append(" World");
		buffer.append('!');
		buffer.append(2020);
		System.out.println(buffer.toString());
	}

}
