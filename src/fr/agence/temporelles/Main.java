package fr.agence.temporelles;

public class Main 
{

	public static void main(String[] args) 
	{
		
		AgentScientifique agent1 = new AgentScientifique("Baba", 3, 2022);
        AgentInfiltre agent2 = new AgentInfiltre("Mathis", 7, 2018);
        AgentTechnologique agent3 = new AgentTechnologique("Andy", 5, 2020);

        Anomalie anomalie1 = new Anomalie("Dérèglement du continuum", 1890, Dangerosite.ELEVE);
        Anomalie anomalie2 = new Anomalie("Présence d'un artefact futuriste", 1500, Dangerosite.MOYEN);
        Anomalie anomalie3 = new Anomalie("Faille numérique dans le réseau temporel", 2100, Dangerosite.MOYEN);

        
        Mission mission1 = new Mission("Réparer le temps", anomalie1, agent1);
        Mission mission2 = new Mission("Infiltration historique", anomalie2, agent2);
        Mission mission3 = new Mission("Correction de la faille numérique", anomalie3, agent3);

        mission1.debutMission();
        mission2.debutMission();
        mission3.debutMission();
	}

}
