package Angle;

public class Angle {
    private int degrees;
    private int minutes;

    public Angle(int Degrees, int Minutes) {
        this.degrees = Degrees;
        this.minutes = Minutes;
    }
    public int GetDegrees() {
        return degrees;
    }
    public int GetMinutes() {
        return  minutes;
    }
    public double toRadians() {
        double angle = (degrees + minutes / 60.0) * Math.PI / 180.0;

        return angle;
    }

    public void normalize() {
        degrees = degrees % 360;
        if (degrees < 0) {
            degrees += 360;
        }
    }

    public void add(int Degrees, int Minutes) {
        this.degrees += Degrees;
        this.minutes += Minutes;

        normalize();
    }

    public void subtract(int Degrees, int Minutes) {
        this.degrees -= Degrees;
        this.minutes -= Minutes;

        normalize();
    }

    public double sin() {
        double angle = toRadians();
        return Math.sin(angle);
    }

    public boolean equals(Object obj) {
        boolean b = false;
        if ( obj instanceof Angle )
        {
            Angle obj1 = (Angle) obj;
            if ( degrees == obj1.GetDegrees() && minutes == obj1.GetMinutes())
                b = true;
        }
        return b;
    }

    public String toString() {
        return degrees + " " + minutes;
    }
}
