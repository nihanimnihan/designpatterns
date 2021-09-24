package structural.adapter;

public class CsvFormat implements CsvFormatter {

    @Override
    public String formatCsvText(String text){
        String formattedText=text.replace(".",",");
        return formattedText;
    }
}
