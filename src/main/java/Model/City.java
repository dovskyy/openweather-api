package Model;

import lombok.*;

import javax.xml.bind.annotation.*;

//<city id="2643743" name="London">
// ^ city jest elementem, jest tagiem - zaczyna się i kończy
//       ^ id jest atrybutem, składową w tagu
//                      ^ name jest atrybutem
//      <coord lon="-0.13" lat="51.51"/>
//      <country>GB</country>
//      <sun rise="2017-01-30T07:40:36" set="2017-01-30T16:47:56"/>
//</city>
// ^ city się kończy

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "coord",
        "country",
        "sun"
})
public class City {

    @XmlElement(required = true)
    protected Coord coord;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected Sun sun;
    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
}
