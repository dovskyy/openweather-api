package Model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement
public class Speed {

    @XmlAttribute (name = "value")
    private double value;

    @XmlAttribute (name = "name")
    private String name;
}
