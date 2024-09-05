package fraction.str;

public final class Str {

    private final byte[] values;

    public Str(byte[] values) {
        this.values = values;
    }

    @Override
    public int hashCode() {
        final int prime = 29;
        int hash = 1;
        // use the Horner schema
        for (byte b : values) {
            hash = prime * hash + b;
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Str other = (Str) obj;
        if (values.length != other.values.length) {
            return false;
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] != other.values[i]) {
                return false;
            }
        }
        return true;
    }
    //Klasse String in java.lang.String ist final...usw(Blatt 10.8)

    @Override
    public String toString(){
        return String.valueOf(values);
    }
}
