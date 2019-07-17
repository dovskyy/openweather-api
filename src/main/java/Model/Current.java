package Model;

import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "city",
        "temperature",
        "humidity",
        "pressure",
        "wind",
        "clouds",
        "visibility",
        "precipitation",
        "weather",
        "lastupdate"
})
@XmlRootElement(name = "current")
public class Current {

    @XmlElement(required = true)
    protected City city;
    @XmlElement(required = true)
    protected Temperature temperature;
    @XmlElement(required = true)
    protected Humidity humidity;
    @XmlElement(required = true)
    protected Pressure pressure;
    @XmlElement(required = true)
    protected Wind wind;
    @XmlElement(required = true)
    protected Clouds clouds;
    @XmlElement(required = true)
    protected Visibility visibility;
    @XmlElement(required = true)
    protected Precipitation precipitation;
    @XmlElement(required = true)
    protected Weather weather;
    @XmlElement(required = true)
    protected LastUpdate lastupdate;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public LastUpdate getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(LastUpdate lastupdate) {
        this.lastupdate = lastupdate;
    }
}
