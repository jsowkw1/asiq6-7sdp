// Strategy interface
interface Tactic {
    void playStyle();
}

// Concrete strategies
class OffensiveTactic implements Tactic {
    @Override
    public void playStyle() {
        System.out.println("Using 3-5-2 formation: aggressive attacking, pressing high up the field!");
    }
}

class DefensiveTactic implements Tactic {
    @Override
    public void playStyle() {
        System.out.println("Using 4-4-2 formation: compact defense and quick counterattacks.");
    }
}

class PossessionTactic implements Tactic {
    @Override
    public void playStyle() {
        System.out.println("Using 4-3-3 formation: maintaining ball possession and controlling tempo.");
    }
}

// Context class
class FootballTeam {
    private Tactic tactic;
    private String teamName;

    public FootballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void setTactic(Tactic tactic) {
        this.tactic = tactic;
    }

    public void startMatch() {
        System.out.println("\n" + teamName + " enters the field with 3-5-2 formation.");
        if (tactic != null) {
            tactic.playStyle();
        } else {
            System.out.println("No tactic selected! The team looks confused!");
        }
    }
}

// Main class
public class FootballStrategy {
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam("Astana United");

        team.setTactic(new OffensiveTactic());
        team.startMatch();

        team.setTactic(new PossessionTactic());
        team.startMatch();

        team.setTactic(new DefensiveTactic());
        team.startMatch();
    }
}
