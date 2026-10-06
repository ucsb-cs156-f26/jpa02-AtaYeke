package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Ataman";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "AtaYeke";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f26-10");
        team.addMember("Ataman");
        team.addMember("Cris");
        team.addMember("Nathan");
        team.addMember("Shivansh");
        team.addMember("Yongxin");
        team.addMember("Zhewen");
        return team;
    }
}
