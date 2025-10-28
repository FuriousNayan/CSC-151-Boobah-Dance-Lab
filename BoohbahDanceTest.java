public class BoohbahDanceTest {
    public static void main(String[] args) {
        Boohbah ZingZingZingbah = new Boohbah("Zing Zing Zingbah", "Spin and Sparkle");
        Boohbah Humbah = new Boohbah("Humbah", "Wiggle Wiggle");
        Boohbah Jumbah = new Boohbah("Jumbah", "Twirl of Joy");

        Boohbah[] boohbahArray = {ZingZingZingbah, Humbah, Jumbah};
        DanceRoutine danceRoutine = new DanceRoutine(boohbahArray);

        System.out.println("Original Routine: ");
        System.out.println(danceRoutine.buildRoutine());
        System.out.println("Modified Routine: ");
        System.out.println(danceRoutine.modifyRoutine());
        
    }
}
