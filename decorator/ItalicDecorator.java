package decorator;

public class ItalicDecorator extends TextDecorator {

    public ItalicDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String format() {
        return "<i>" + super.format() + "</i>";
    }
}
