package vn.edu.csc.bt_fragment;

import java.util.ArrayList;

public class Logo {
    String name;
    String description;
    int image;

    public Logo(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public static ArrayList<Logo> init(){
        ArrayList<Logo> tmp = new ArrayList<>();
        tmp.add(new Logo("Apple",
                "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops",
                R.drawable.apple));
        tmp.add(new Logo("Canon",
                "Canon or Canons may refer to: Canon, Georgia, a city in the United States Canons Park, London, UK Canon Row, a street in Westminster, London Cañon City",
                R.drawable.canon));
        tmp.add(new Logo("Apple",
                "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops",
                R.drawable.apple));
        tmp.add(new Logo("Canon",
                "Canon or Canons may refer to: Canon, Georgia, a city in the United States Canons Park, London, UK Canon Row, a street in Westminster, London Cañon City",
                R.drawable.canon));
        tmp.add(new Logo("Apple",
                "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops",
                R.drawable.apple));
        tmp.add(new Logo("Canon",
                "Canon or Canons may refer to: Canon, Georgia, a city in the United States Canons Park, London, UK Canon Row, a street in Westminster, London Cañon City",
                R.drawable.canon));
        tmp.add(new Logo("Apple",
                "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops",
                R.drawable.apple));
        tmp.add(new Logo("Canon",
                "Canon or Canons may refer to: Canon, Georgia, a city in the United States Canons Park, London, UK Canon Row, a street in Westminster, London Cañon City",
                R.drawable.canon));

        return tmp;
    }
}
