package fr.agence.temporelles;

abstract class AgentTemporel {
    protected String nom;
    protected int niveauExperience;
    protected int anneeRecrutement;

    public AgentTemporel(String nom, int niveauExperience, int anneeRecrutement) {
        this.nom = nom;
        this.niveauExperience = niveauExperience;
        this.anneeRecrutement = anneeRecrutement;
    }

    public abstract void executerMission(Anomalie anomalie);
}
