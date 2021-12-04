package com.company.model;

public enum ClothingSize {

    //Internal values
    S("Small"), M("Medium"), L("Large"), XL("Extra Large");

    //We create this variable so it can go with the internal values
    private String sizeDescription;

    //The constructor will make the description go hand in hand with the internal values.
    ClothingSize(String sizeDescription) {
        this.sizeDescription = sizeDescription;
    }


    //The reason we are doing this is because, if we use a getter, it will get us the internal values (s,m,l...)
    //Instead, we want it to show the description that is next to the value. This will be called automatically instead of a getter
    @Override
    public String toString() {
        return sizeDescription;
    }
}
