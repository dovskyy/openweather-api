package Model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "coord")
public class Coord {

    @XmlAttribute (name = "lat")
    private double lat;

    @XmlAttribute (name = "lon")
    private double lon;
}
