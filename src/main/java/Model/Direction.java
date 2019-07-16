package Model;

import com.sun.xml.txw2.annotation.XmlElement;
import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement (name = "direction")
public class Direction {

    @XmlAttribute (name = "value")
    private double value;

    @XmlAttribute (name = "code")
    private String code;

    @XmlAttribute (name = "name")
    private String name;
}
