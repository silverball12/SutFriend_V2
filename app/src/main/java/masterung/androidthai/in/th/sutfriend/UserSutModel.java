package masterung.androidthai.in.th.sutfriend;

import android.os.Parcel;
import android.os.Parcelable;

public class UserSutModel implements Parcelable{
    private String nameString, urlString;

    public UserSutModel() {
    }   //getter

    public UserSutModel(String nameString, String urlString) {
        this.nameString = nameString;
        this.urlString = urlString;
    }   //setter

    protected UserSutModel(Parcel in) {
        nameString = in.readString();
        urlString = in.readString();
    }

    public static final Creator<UserSutModel> CREATOR = new Creator<UserSutModel>() {
        @Override
        public UserSutModel createFromParcel(Parcel in) {
            return new UserSutModel(in);
        }

        @Override
        public UserSutModel[] newArray(int size) {
            return new UserSutModel[size];
        }
    };

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getUrlString() {
        return urlString;
    }

    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nameString);
        dest.writeString(urlString);
    }
}   //Main Class
