package creational.abstract_factory;

public class WindowsFactory implements GUI_Factory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
