package model;

/**
 * Model perhitungan MBI (BMI).
 * berat dalam kg, tinggi dalam cm.
 *
 * @author muama
 */
public class MBI {

    private final double berat;   // kg
    private final double tinggi;  // cm

    public MBI(double berat, double tinggi) {
        if (Double.isNaN(berat) || Double.isInfinite(berat)
                || Double.isNaN(tinggi) || Double.isInfinite(tinggi)) {
            throw new IllegalArgumentException("Berat dan tinggi harus berupa angka yang valid");
        }
        if (berat <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Berat dan tinggi harus lebih dari 0");
        }
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    /** Nilai MBI = berat (kg) / tinggi (m)^2 */
    public double hasil() {
        double tinggiMeter = tinggi / 100.0;
        return berat / (tinggiMeter * tinggiMeter);
    }

    /** Kategori berdasarkan standar WHO. */
    public String kategori() {
        double nilai = hasil();
        if (nilai < 18.5) {
            return "Kurus (underweight)";
        } else if (nilai < 25.0) {
            return "Normal";
        } else if (nilai < 30.0) {
            return "Kelebihan berat badan (overweight)";
        } else {
            return "Obesitas";
        }
    }
}