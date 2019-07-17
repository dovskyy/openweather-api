package Model;

import lombok.*;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "sun")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Sun {

    @XmlAttribute(name = "rise", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rise;
    @XmlAttribute(name = "set", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar set;

}
