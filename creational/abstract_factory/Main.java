package creational.abstract_factory;



public class Main {

	public static void main(String[] args) {
		GUI_Factory windowsFactory=new WindowsFactory();
		windowsFactory.createButton().render();;

		GUI_Factory macFactory=new MacOsFactory();
		macFactory.createButton().render();

	}
}
