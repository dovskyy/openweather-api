package Model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement (name = "wind")
public class Wind {

    @XmlElement(name = "speed")
    private Speed speed;

    @XmlElement (name = "direction")
    private Direction direction;
}
