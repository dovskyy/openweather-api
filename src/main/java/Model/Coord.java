package Model;

import lombok.*;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "coord")
@XmlAccessorType(XmlAccessType.FIELD)
public class Coord {

    @XmlAttribute(name = "lon", required = true)
    protected BigDecimal lon;
    @XmlAttribute(name = "lat", required = true)
    protected BigDecimal lat;
}
