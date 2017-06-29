package com.getfire;

public class Ant extends Insect {
    private boolean isQueen;
    private String caste;


    public Ant(String area, String caste) {
        super(area);
        this.caste = caste;
    }

    public Ant(String caste) {
        this.caste = caste;
    }

    @Override
    public void collectArmy() {
        System.out.println("Carefully, danger already close! We must prepare ");
    }

    @Override
    public void sting() {
        System.out.println("Fire in the hole!");
    }

    public int collectFood() throws Exception {
        if (!isQueen) {
            System.out.println("Ok... I'm going to bring some food");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(100);
                if (((int) (Math.random() * 29)) % 3 == 0) {
                    System.out.println("We need more food...");
                } else {
                    System.out.println("I still collect food for my queen!");
                }

            }
            int result;
            if ((result = (int) (Math.random() * 10)) <= 2) {
                System.out.println("I have very few berries, I`ve to continue");
                result = collectFood();
            }
            System.out.println("I`ve brought " + result + " berries");

            return result;
        } else {
            System.out.println("Who does that Programmer think he is?");
            Thread.sleep(2000);
            System.out.println("Yes! I`m speaking to you!");
            Thread.sleep(1500);
            System.out.println("Don't you see, that I am QUEEN!");
            Thread.sleep(1000);
            System.out.println("Have a nice time!");
            return 0;
        }
    }

    public boolean isQueen() {
        return isQueen;
    }

    public void setQueen(boolean queen) {
        isQueen = queen;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        if (caste == null || caste.equals("")) {
            return;
        }
        this.caste = caste;
    }
}
