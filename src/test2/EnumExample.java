package test2;

public class EnumExample {
	
	enum Level {
	    LOW,
	    MEDIUM,
	    HIGH
	  }

	public static void main(String[] args) {
		Level lev= Level.HIGH;
		System.out.println(lev);
		Level[] myl= Level.values();
		for(Level l: myl)
		{
			System.out.println(l);
		}
	}

}
