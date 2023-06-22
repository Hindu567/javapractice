package test2;

 public class Ecapsulation {

	private int age;
	private String text;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
 class Test{
	 
	 public static void main(String[] args)
	 {
		 Ecapsulation en= new Ecapsulation(); 
		 en.setAge(2);
		 en.setText("This is test");
		 
		 System.out.println( en.getAge() +"  "+ en.getText());
		 
		}
 }