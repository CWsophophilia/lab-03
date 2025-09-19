package com.example.listycitylab3;

public class City {
    final String name;
    final String province;

    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }
}
