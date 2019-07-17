package Model;

import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Visibility {

    @XmlAttribute(name = "value", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int value;
}