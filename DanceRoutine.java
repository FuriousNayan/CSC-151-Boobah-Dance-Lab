public class DanceRoutine {
    private Boohbah[] boohbahs;

    public DanceRoutine(Boohbah[] boohbahs){
        this.boohbahs = boohbahs;
    }

    public String buildRoutine(){
        StringBuilder sb = new StringBuilder();
        for (Boohbah boohbah : boohbahs) {
            sb.append(boohbah.performMove() + '\n');
        }
        return sb.toString();
    }

    public String modifyRoutine(){
        String newRoutine = this.buildRoutine().replace("performs", "dances to");
        return newRoutine;
    }
}
