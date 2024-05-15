package decorator;

public class BoldDecorator extends TextDecorator {

    public BoldDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String format() {
        return "<b>" + super.format() + "</b>";
    }
}
