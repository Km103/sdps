package decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Text plainText = new PlainText("Hello, World!");

        Text boldText = new BoldDecorator(plainText);
        Text italicText = new ItalicDecorator(plainText);
        Text underlineText = new UnderlineDecorator(plainText);

        System.out.println("Plain Text: " + plainText.format());
        System.out.println("Bold Text: " + boldText.format());
        System.out.println("Italic Text: " + italicText.format());
        System.out.println("Underline Text: " + underlineText.format());

        // Combining multiple decorators
        Text boldItalicText = new BoldDecorator(new ItalicDecorator(plainText));
        System.out.println("Bold and Italic Text: " + boldItalicText.format());

        Text allDecoratorsText = new BoldDecorator(new ItalicDecorator(new UnderlineDecorator(plainText)));
        System.out.println("Bold, Italic, and Underline Text: " + allDecoratorsText.format());
    }
}
