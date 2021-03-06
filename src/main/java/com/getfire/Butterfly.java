package com.getfire;

public class Butterfly extends Insect {
    private static final int MIN_DAYS = 1;
    private String wings_color;
    private int dayOfLive;

    public Butterfly(String wings_color) {
        this.wings_color = wings_color;
    }

    public Butterfly(String area, String wings_color) {
        super(area);
        this.wings_color = wings_color;
    }

    public String getWings_color() {
        return wings_color;
    }

    public void setWings_color(String wings_color) {
        this.wings_color = wings_color;
    }

    public int getDayOfLive() {
        return dayOfLive;
    }

    public void setDayOfLive(int dayOfLive) {
        if (dayOfLive < MIN_DAYS) {
            return;
        }
        this.dayOfLive = dayOfLive;
    }

    private void bringLove() {
        System.out.println("Listen to love (please visit this link https://www.youtube.com/watch?v=waU75jdUnYw)");
    }

    @Override
    public void collectArmy() {
        System.out.println("OMG! I'm just a Butterfly, don't hurt me!");
    }

    @Override
    public void sting() {
        System.out.println("All right, man, you asked for it...");
    }

    @Override
    public int collectFood() throws Exception {
        System.out.println("I'm Butterfly, so I shouldn't bring any food");
        System.out.println("Instead, I'll bring some love to you!");
        bringLove();
        return 0;
    }
}
