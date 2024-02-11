package com.sugarglider.generics.practice;

public class Main {
    public static void main(String[] args) {
        Team<BaseBallPlayer> phillies = new Team<>("Philadelphia");
        Team<BaseBallPlayer> astros = new Team<>("Astros");

        BaseBallPlayer rishi = new BaseBallPlayer("Rishi", "Left Side");
        phillies.addTeamMembers(rishi);
        phillies.listTeamMembers();

        BaseBallPlayer sunak = new BaseBallPlayer("Sunak","Right Side");
        astros.addTeamMembers(sunak);
        astros.listTeamMembers();

        scoreResult(phillies, 2, astros , 3);

        Team<FootBallPlayer> washers = new Team<>("Washington");
        Team<FootBallPlayer> newbies = new Team<>("New York");

        FootBallPlayer sunil = new FootBallPlayer("Sunil", "Mid Position");
        washers.addTeamMembers(sunil);
        washers.listTeamMembers();

        FootBallPlayer chettri = new FootBallPlayer("Chettri", "Goal Keeper");
        newbies.addTeamMembers(chettri);
        newbies.listTeamMembers();

        scoreResult(washers, 3, newbies, 5);
    }

    public static void scoreResult(Team team1 , int score1,  Team team2, int score2){
        String message = team1.setScore(score1,score2);
        team2.setScore(score2,score1);
        System.out.printf("%s %s %s %n", team1, message,team2);
    }
}
