package Model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement
public class Weather {


    @XmlAttribute (name = "number")
    private double number;

    @XmlAttribute (name = "value")
    private String value;

    @XmlAttribute (name = "icon")
    private String icon;
}
