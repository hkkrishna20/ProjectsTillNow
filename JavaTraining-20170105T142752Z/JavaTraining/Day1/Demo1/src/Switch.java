
public class Switch {

	public void show(String color) {
		switch(color) {
		case "red" :
			System.out.println("You selected Red color");
			break;
		case "blue":
			System.out.println("You selected Blue color");
			break;
		case "green":
			System.out.println("You selected Green color");
			break;
		}
	}
	public static void main(String[] args) {
		String color="blue";
		Switch obj=new Switch();
		obj.show(color);
	}
}
