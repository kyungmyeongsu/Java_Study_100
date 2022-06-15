package src02;

public class java02 {

	public static void main(String[] args) {
		// byte(1), short(2), int(4), long(8), char(2) --byte기준
		// byte(8), short(16), int(32), long(64), char(16) --bit기준
		System.out.println(Byte.BYTES); //---바이트 계산
		System.out.println(Byte.SIZE); //---비트 계산
		System.out.println(Short.BYTES); 
		System.out.println(Short.SIZE); 
		
		System.out.println("byte\t: " + Byte.BYTES + "(바이트)" + "-->" + Byte.SIZE + "(비트)\t" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short\t: " + Short.BYTES + "(바이트)" + "-->" + Short.SIZE + "(비트)\t" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("int\t: " + Integer.BYTES + "(바이트)" + "-->" + Integer.SIZE + "(비트)\t" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("long\t: " + Long.BYTES + "(바이트)" + "-->" + Long.SIZE + "(비트)\t" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("char\t: " + Character.BYTES + "(바이트)" + "-->" + Character.SIZE + "(비트)\t" + Character.MIN_VALUE + "~" + Character.MAX_VALUE);
		System.out.println("char\t: " + Character.BYTES + "(바이트)" + "-->" + Character.SIZE + "(비트)\t" + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);

	}

}
