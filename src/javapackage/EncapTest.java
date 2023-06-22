package javapackage;
class Encap{
	private int age;
	private String text;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
public class EncapTest {

	public static void main(String[] args) {
		Encap en= new Encap(); 
		 en.setAge(5);
		 en.setText("This is test");
		 
		 System.out.println( en.getAge() +"  "+ en.getText());
		 
	}

}
