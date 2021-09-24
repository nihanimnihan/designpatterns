package structural.adapter;

public class TextFormat implements TextFormatter {

    @Override
    public String formatText(String text) {
        String formattedText=text.replace(".","\n");
        return formattedText;
    }
}
