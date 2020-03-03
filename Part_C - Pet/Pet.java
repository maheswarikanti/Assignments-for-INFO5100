public class Pet {
    private String petName;
    private String ownerName;
    private String color;
    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;
    protected Integer sex;
    protected String seValue;

    public Pet(String PetName, String OwnerName, String Color) {
        petName = PetName;
        ownerName = OwnerName;
        color = Color;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setSex(Integer sexed1) {
        sex = sexed1;
    }

    public String getSex() {
        if(sex == MALE)
        {
            return "MALE";
        }
        else if(sex == FEMALE)
        {
            return "FEMALE";
        }
        else if(sex == SPAYED)
        {
            return "SPAYED";
        }
        else
        {
            return "NEUTERED";
        }
    }

        public String toString() {
            return getPetName() + "  owned by " + getOwnerName() + "\nColor : " + getColor() + "\nSex : " + getSex();
        }
}

