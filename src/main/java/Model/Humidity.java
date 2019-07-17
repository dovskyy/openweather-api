package Model;

import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Humidity {

    @XmlAttribute(name = "value", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short value;
    @XmlAttribute(name = "unit", required = true)
    protected String unit;

    public short getValue() {
        return value;
    }

    public void setValue(short value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
