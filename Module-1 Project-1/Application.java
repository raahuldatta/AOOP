public class Application {
    private Button button;
    private TextBox textBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        textBox = factory.createTextBox();
    }

    public void renderUI() {
        button.paint();
        textBox.render();
    }

    public static void main(String[] args) {
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else if (os.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported operating system: " + os);
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
