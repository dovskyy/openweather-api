package Model;

import com.sun.xml.txw2.annotation.XmlElement;
import lombok.*;

import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Direction {

    @XmlAttribute(name = "value", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short value;
    @XmlAttribute(name = "code", required = true)
    protected String code;
    @XmlAttribute(name = "name", required = true)
    protected String name;
}
