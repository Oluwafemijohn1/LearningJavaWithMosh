package main.learningjava.AdvancedTopic.generics;

public class User implements Comparable<User>, Cloneable {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User o) {
        // this < o => -1
        // this == o => 0
        // this > o => 1
        return points - o.points;

        /**
         * e.i
         * */
        //if(this.points < o.points)
        //    return -1;
        //if(this.points == o.points)
        //    return 0;
        //return 1;
    }

    @Override
    public String toString() {
        return "Points: " + points;
    }
}
