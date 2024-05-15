package decorator;

public class UnderlineDecorator extends TextDecorator {

    public UnderlineDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String format() {
        return "<u>" + super.format() + "</u>";
    }
}
