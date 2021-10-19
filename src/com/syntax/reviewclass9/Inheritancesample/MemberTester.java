package com.syntax.reviewclass9.Inheritancesample;

public class MemberTester {
    public static void main(String[] args) {

    Player p= new Player();
    p.run();
    p.athlete();



    Manager m =new Manager();
    m.name="Ronaldo";
    m.managingSkills();
    m.athlete();

    Physio ph= new Physio();
    ph.athlete();
    ph.duty();



    }



}
