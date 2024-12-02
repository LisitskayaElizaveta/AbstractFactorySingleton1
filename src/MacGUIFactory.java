import javax.crypto.Mac;

public class MacGUIFactory implements GUIFactory {
    private static MacGUIFactory instance;

    protected MacGUIFactory() {
        System.out.println("Creating gui factory for Mac OS");
    }

    public static MacGUIFactory getInstance() {
        if (instance == null) {
            instance = new MacGUIFactory();
        }
        return instance;
    }

    @Override
    public Button createButton() {
        System.out.println("Creating Button for Mac OS");
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Creating TextField for Mac OS");
        return new MacTextField();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating Select for Mac OS");
        return new MacSelect();
    }
}
