package structural.adapter;

public class CsvAdapter implements TextFormatter {

    CsvFormatter csvFormatter;
    public CsvAdapter(CsvFormatter csvFormatter){
        this.csvFormatter=csvFormatter;
    }

    @Override
    public String formatText(String text) {
        String formattedText=csvFormatter.formatCsvText(text);
        return formattedText;
    }
}
