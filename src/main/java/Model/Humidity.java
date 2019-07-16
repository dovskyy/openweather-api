package Model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement (name = "humidity")
public class Humidity {

    @XmlAttribute (name = "value")
    private double value;

    @XmlAttribute (name = "unit")
    private String unit;
}
