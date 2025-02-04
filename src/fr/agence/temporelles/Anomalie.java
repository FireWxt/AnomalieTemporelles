package fr.agence.temporelles;

public class Anomalie 
{
    private String description;
    private int anneeApparition;
    private Dangerosite dangerosite;
    private Statut statut;

    public Anomalie(String description, int anneeApparition, Dangerosite dangerosite) 
    {
        this.description = description;
        this.anneeApparition = anneeApparition;
        this.dangerosite = dangerosite;
        this.statut = Statut.NON_RESOLUE;
    }

    public void setStatut(Statut statut)
    {
        this.statut = statut;
    }

	public String getDescription() 
	{
		return description;
	}

	public int getAnneeApparition() 
	{
		return anneeApparition;
	}

	public Dangerosite getDangerosite() {
		return dangerosite;
	}

	public Statut getStatut() {
		return statut;
	}
    
    

}

