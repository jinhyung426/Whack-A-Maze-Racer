package com.example.myapplication.WhackAMole;

class MoleFactory {
    Mole createMole(String moleType, Hole hole){
        if(moleType.equalsIgnoreCase("lindsey")){
            return new LindseyMole(hole);
        }else if(moleType.equalsIgnoreCase("paul")){
            return new PaulMole(hole);
        }else if(moleType.equalsIgnoreCase("generic")){
            return new Mole(hole);
        }
        return null;
    }
}
