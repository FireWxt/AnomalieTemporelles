package fr.agence.temporelles;

public class AgentScientifique extends AgentTemporel implements VoyageurTemporel
{
    public AgentScientifique(String nom, int niveauExperience, int anneeRecrutement) 
    {
        super(nom, niveauExperience, anneeRecrutement);
    }

    @Override
    public void executerMission(Anomalie anomalie) 
    {
        System.out.println(nom + " analyse l'anomalie et réduit son impact temporel.");
        anomalie.setStatut(Statut.RESOLUE);
    }

	@Override
	public void voyagerDansLeTemps(int anneeDestination) 
	{
		System.out.println(nom + "voyage vers l'année : " + anneeDestination);
		
	}
}