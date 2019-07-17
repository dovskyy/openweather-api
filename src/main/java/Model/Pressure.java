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
public class Pressure {

    @XmlAttribute(name = "value", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int value;
    @XmlAttribute(name = "unit", required = true)
    protected String unit;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
