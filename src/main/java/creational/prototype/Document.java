package creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Document implements Cloneable {
    Long id;
    String name;
    private DocumentType documentType;
    private DocumentCategory documentCategory;

    @Override
    protected Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }
}
