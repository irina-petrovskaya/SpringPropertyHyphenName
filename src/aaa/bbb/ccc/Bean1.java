package aaa.bbb.ccc;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/29/2016.
 * Project: propertyHyphenName
 * *******************************
 */
public class Bean1 {

    String mySuperProp1;
    String mySuperProp_2;
    String mySuperProp3;

   /* public Bean1() {
    }*/

    public Bean1(String mySuperProp1, String mySuperProp_2, String mySuperProp3) {
        this.mySuperProp1 = mySuperProp1;
        this.mySuperProp_2 = mySuperProp_2;
        this.mySuperProp3 = mySuperProp3;
    }

    public String getMySuperProp1() {
        return mySuperProp1;
    }

    public void setMySuperProp1(String mySuperProp1) {
        this.mySuperProp1 = mySuperProp1;
    }

    public String getMySuperProp_2() {
        return mySuperProp_2;
    }

    public void setMySuperProp_2(String mySuperProp_2) {
        this.mySuperProp_2 = mySuperProp_2;
    }

    public String getMySuperProp3() {
        return mySuperProp3;
    }

    public void setMySuperProp3(String mySuperProp3) {
        this.mySuperProp3 = mySuperProp3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bean1{");
        sb.append("mySuperProp1='").append(mySuperProp1).append('\'');
        sb.append(", mySuperProp_2='").append(mySuperProp_2).append('\'');
        sb.append(", mySuperProp3='").append(mySuperProp3).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
