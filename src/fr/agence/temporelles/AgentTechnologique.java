package fr.agence.temporelles;

public class AgentTechnologique extends AgentTemporel implements HackeurTemporel {
    public AgentTechnologique(String nom, int niveauExperience, int anneeRecrutement) {
        super(nom, niveauExperience, anneeRecrutement);
    }

    @Override
    public void executerMission(Anomalie anomalie) {
        System.out.println(nom + " utilise la technologie avancée pour résoudre l'anomalie.");
        anomalie.setStatut(Statut.RESOLUE);
    }

    @Override
    public void piraterSysteme(String cible) {
        System.out.println(nom + " pirate le système temporel de " + cible + ".");
    }
}
