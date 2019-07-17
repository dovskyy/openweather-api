package Model;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "speed",
        "gusts",
        "direction"
})
public class Wind {

    @XmlElement(required = true)
    protected Speed speed;
    @XmlElement(required = true)
    protected Object gusts;
    @XmlElement(required = true)
    protected Direction direction;

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Object getGusts() {
        return gusts;
    }

    public void setGusts(Object gusts) {
        this.gusts = gusts;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
