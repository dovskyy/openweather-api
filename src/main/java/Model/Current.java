package Model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement (name = "current")
public class Current {

    @XmlElement (name = "city")
    private City city;

    @XmlElement (name = "temperature")
    private Temperature temperature;

    @XmlElement (name = "city")
    private Humidity humidity;

    @XmlElement (name = "pressure")
    private Pressure pressure;

    @XmlElement (name = "wind")
    private Wind wind;

    @XmlElement (name = "clouds")
    private Clouds clouds;

    @XmlElement (name = "visibility")
    private Visibility visibility;

    @XmlElement (name = "precipitation")
    private Precipitation precipitation;

    @XmlElement (name = "weather")
    private Weather weather;

    @XmlElement (name = "lastupdate")
    private LastUpdate lastUpdate;

}
