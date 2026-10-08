package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void same_object() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void different_class() {
        assertEquals(false, team.equals("team"));
    }

    @Test
    public void true_name_true_member() {
        Team other = new Team("test-team");
        assertEquals(true, team.equals(other));
    }

    @Test
    public void true_name_false_member() {
        Team other = new Team("test-team");
        other.addMember("new-member");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void false_name_true_member() {
        Team other = new Team("false-team");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void false_name_false_member() {
        Team other = new Team("false-team");
        other.addMember("new-member");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void hashCode_gap() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void equivalent_mutation(){
        Team t1 = new Team();
        int result = t1.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
}