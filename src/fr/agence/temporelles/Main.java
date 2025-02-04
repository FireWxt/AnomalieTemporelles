package fr.agence.temporelles;

public class Main {

	public static void main(String[] args) {
		
		AgentScientifique agent1 = new AgentScientifique("Dr. Time", 5, 2022);
        AgentInfiltre agent2 = new AgentInfiltre("Shadow", 7, 2018);
        AgentTechnologique agent3 = new AgentTechnologique("TechnoMage", 6, 2020);

        Anomalie anomalie1 = new Anomalie("Dérèglement du continuum", 1890, Dangerosite.ELEVE);
        Anomalie anomalie2 = new Anomalie("Présence d'un artefact futuriste", 1500, Dangerosite.MOYEN);

        Mission mission1 = new Mission("Réparer le temps", anomalie1, agent1);
        Mission mission2 = new Mission("Infiltration historique", anomalie2, agent2);

        mission1.lancerMission();
        mission2.lancerMission();
	}

}
