package fr.agence.temporelles;

public class Mission {
	private String titre;
    private Anomalie anomalie;
    private AgentTemporel agent;

    public Mission(String titre, Anomalie anomalie, AgentTemporel agent) {
        this.titre = titre;
        this.anomalie = anomalie;
        this.agent = agent;
    }

    public void lancerMission() {
        System.out.println("Début de la mission: " + titre);
        agent.executerMission(anomalie);
    }
}
