package fr.agence.temporelles;

public class AgentInfiltre extends AgentTemporel implements ExpertEnDiscretion {
	public AgentInfiltre(String nom, int niveauExperience, int anneeRecrutement) {
		super(nom, niveauExperience, anneeRecrutement);
	}

	@Override
	public void executerMission(Anomalie anomalie) {
		System.out.println(nom + " se fond dans le decor et neutralise l'anomalie discrètement.");
		anomalie.setStatut(Statut.RESOLUE);
	}

	@Override
	public void seFondreDansLeDecor() {
		System.out.println(nom + " se fond parfaitement dans l'epoque cible.");
	}
}