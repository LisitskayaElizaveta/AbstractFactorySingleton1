public class WindowsGUIFactory implements GUIFactory {
    private static WindowsGUIFactory instance;

    protected WindowsGUIFactory() {
        System.out.println("Creating gui factory for Windows OS");
    }

    public static WindowsGUIFactory getInstance() {
        if (instance == null) {
            instance = new WindowsGUIFactory();
        }
        return instance;
    }

    @Override
    public Button createButton() {
        System.out.println("Creating Button for Windows OS");
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Creating TextField for Windows OS");
        return new WindowsTextField();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating Select for Windows OS");
        return new WindowsSelect();
    }
}
