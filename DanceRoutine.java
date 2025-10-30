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

    public String remixRoutine(){
        String newRoutine = this.buildRoutine().replace("performs", "dances to");
        StringBuilder remixedRoutineBuilder = new StringBuilder();
        remixedRoutineBuilder.insert(0,"---REMIX---\n");
        remixedRoutineBuilder.append(newRoutine);
        remixedRoutineBuilder.delete(remixedRoutineBuilder.length() - 1, remixedRoutineBuilder.length());
        remixedRoutineBuilder.append("\n(Backwards Boohbah Shuffle!)");
        remixedRoutineBuilder.reverse();
        return remixedRoutineBuilder.toString();
    }
}
