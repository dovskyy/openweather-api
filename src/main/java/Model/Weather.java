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
public class Weather {

    @XmlAttribute(name = "number", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int number;
    @XmlAttribute(name = "value", required = true)
    protected String value;
    @XmlAttribute(name = "icon", required = true)
    protected String icon;
}
