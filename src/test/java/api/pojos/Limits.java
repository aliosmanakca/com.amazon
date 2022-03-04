package api.pojos;

// prepared by using --> https://www.jsonschema2pojo.org/
// you should copy response and paste to that website to generate these automatically

public class Limits {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Limits.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}