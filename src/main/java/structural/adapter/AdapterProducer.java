package structural.adapter;

public class AdapterProducer {

    public static void main(String[] args) {
        String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";

        TextFormatter newLineFormatter = new TextFormat();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);

        CsvFormatter csvFormatter = new CsvFormat();
        TextFormatter csvAdapter = new CsvAdapter(csvFormatter);
        String resultCsvString = csvAdapter.formatText(testString);
        System.out.println(resultCsvString);
    }
}
