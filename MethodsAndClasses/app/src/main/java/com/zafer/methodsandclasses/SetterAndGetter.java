package com.zafer.methodsandclasses;

public class SetterAndGetter {
    private String elementOne = "elementsOne";
    private String elementTwo = "elementTwo";
    private String elementThree = "elementThree";
    public SetterAndGetter(String elementOne, String elementTwo, String elementThree) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
        this.elementThree = elementThree;
    }

    public void setElementOne(String elementOne) {
        this.elementOne = elementOne;
    }

    public void setElementTwo(String elementTwo) {
        this.elementTwo = elementTwo;
    }

    public void setElementThree(String elementThree) {
        this.elementThree = elementThree;
    }

    public String getElementOne() {
        return elementOne;
    }

    public String getElementTwo() {
        return elementTwo;
    }

    public String getElementThree() {
        return elementThree;
    }
}

