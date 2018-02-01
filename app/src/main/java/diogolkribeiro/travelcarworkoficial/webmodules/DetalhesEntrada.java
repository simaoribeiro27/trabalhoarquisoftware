package diogolkribeiro.travelcarworkoficial.webmodules;

import com.google.gson.annotations.SerializedName;

/**
 * Created by diogomanuel on 11/01/2018.
 */

public class DetalhesEntrada {

    @SerializedName("_id")
    private String _id;
    @SerializedName("busyPlaces")
    private int busyPlaces;
    @SerializedName("placesAvailable")
    private int placesAvailable;
    @SerializedName("long")
    private float longuitude;
    @SerializedName("lat")
    private float lat;
    @SerializedName("arrival")
    private String arrival;
    @SerializedName("starting")
    private String starting;
    @SerializedName("idUser")
    private String idUser;
    @SerializedName("startingData")
    private String startingData;
    @SerializedName("price")
    private String price;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getBusyPlaces() {
        return busyPlaces;
    }

    public void setBusyPlaces(int busyPlaces) {
        this.busyPlaces = busyPlaces;
    }

    public int getPlacesAvailable() {
        return placesAvailable;
    }

    public void setPlacesAvailable(int placesAvailable) {
        this.placesAvailable = placesAvailable;
    }

    public float getLonguitude() {
        return longuitude;
    }

    public void setLonguitude(float longuitude) {
        this.longuitude = longuitude;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getStarting() {
        return starting;
    }

    public void setStarting(String starting) {
        this.starting = starting;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getStartingData() {
        return startingData;
    }

    public void setStartingData(String startingData) {
        this.startingData = startingData;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DetalhesEntrada{" +
                "_id='" + _id + '\'' +
                ", busyPlaces=" + busyPlaces +
                ", placesAvailable=" + placesAvailable +
                ", longuitude=" + longuitude +
                ", lat=" + lat +
                ", arrival='" + arrival + '\'' +
                ", starting='" + starting + '\'' +
                ", idUser='" + idUser + '\'' +
                ", startingData='" + startingData + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
