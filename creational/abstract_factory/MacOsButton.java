package creational.abstract_factory;

public class MacOsButton implements GUI_Factory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new Mac_Button();
	}

}
