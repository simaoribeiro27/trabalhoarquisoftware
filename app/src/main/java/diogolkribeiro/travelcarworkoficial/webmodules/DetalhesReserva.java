package diogolkribeiro.travelcarworkoficial.webmodules;

import com.google.gson.annotations.SerializedName;

/**
 * Created by diogomanuel on 12/01/2018.
 */

public class DetalhesReserva {

    @SerializedName("_id")
    private String _id;
    @SerializedName("startingData")
    private String startingData;
    @SerializedName("places")
    private int places;
    @SerializedName("phone")
    private int phone;
    @SerializedName("email")
    private String email;
    @SerializedName("name")
    private String name;
    @SerializedName("idTravel")
    private String idTravel;



    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStartingData() {
        return startingData;
    }

    public void setStartingData(String startingData) {
        this.startingData = startingData;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdTravel() {
        return idTravel;
    }

    public void setIdTravel(String idTravel) {
        this.idTravel = idTravel;
    }



    @Override
    public String toString() {
        return "DetalhesReserva{" +
                "_id='" + _id + '\'' +
                ", startingData='" + startingData + '\'' +
                ", places=" + places +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", idTravel='" + idTravel + '\'' +
                '}';
    }
}
