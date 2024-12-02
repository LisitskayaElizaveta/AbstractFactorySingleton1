public class Main {
    private RegistrationForm registrationForm;

    public void drawRegistrationForm() {

        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;

        if (osName.startsWith("win")) {
            guiFactory = new WindowsGUIFactory();
        } else if (osName.startsWith("mac")) {
            guiFactory = new MacGUIFactory();
        } else {
            System.out.println("Ваша ОС не поддерживается :( ");
            return;
        }
        registrationForm = new RegistrationForm(guiFactory);
    }

    public static void main(String[] args) {
        Main application = new Main();
        application.drawRegistrationForm();
    }
}