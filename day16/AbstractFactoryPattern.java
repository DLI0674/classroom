package classroom.day16;

interface Button{
    String describe();
}
interface Text{
    String describe();
}
class DarkModeButton implements Button{
    @Override
    public String describe() {
        return "DarkModeButton";
    }
}
class LightModeButton implements Button{
    @Override
    public String describe() {
        return "LightModeButton";
    }
}

class LightModeText implements Text{
    @Override
    public String describe() {
        return "LightModeText";
    }
}
class DarkModeText implements Text{
    @Override
    public String describe() {
        return "DarkModeText";
    }
}
interface Theme{
    Button createButton();
    Text createText();
}
class DarkMode implements Theme{

    @Override
    public Button createButton() {
        return new DarkModeButton();
    }

    @Override
    public Text createText() {
        return new DarkModeText();
    }
}
class LightMode implements Theme{

    @Override
    public Button createButton() {
        return new LightModeButton();
    }

    @Override
    public Text createText() {
        return new LightModeText();
    }
}
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        Theme lightMode=new LightMode();
        lightMode.createButton();
        lightMode.createText();
        Theme darkMode=new DarkMode();
        darkMode.createText();
        darkMode.createButton();
    }
}
