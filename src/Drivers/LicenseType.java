package Drivers;

public enum LicenseType {
    B("категория B"),
    C("категория C"),
    D("категория D");

    private final String licenseType;

    LicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    @Override
    public String toString() {
        return licenseType;
    }

    public String getLicenseType() {
        return licenseType;
    }
}
