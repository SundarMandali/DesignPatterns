package creational.abstract_factory;

public class MacOsFactory implements GUI_Factory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new Mac_Button();
	}

}
