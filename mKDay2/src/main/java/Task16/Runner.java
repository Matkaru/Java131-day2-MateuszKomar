package Task16;

import java.util.Arrays;

public enum Runner {

    BEGINNER(160, Integer.MAX_VALUE),
    INTERMEDIATE(140,159),
    ADVANCED(0,139);

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    private int minTime;
    private int maxTime;

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        if (BEGINNER.getMinTime()<= time){
            return BEGINNER;
        }else if (INTERMEDIATE.minTime <= time && time <= INTERMEDIATE.maxTime){
            return INTERMEDIATE;
        }else {
            return ADVANCED;
        }
    }
    public static Runner getFitnessLevel2(int time){
        for (Runner runner : Runner.values()) {
            if(runner.minTime <= time && time <= runner.maxTime){
                return runner;
            }
        }
        return null;
    }
    public static Runner getFitnessLevel3(int time){
       return Arrays.stream(Runner.values())
                .filter(runner -> runner.maxTime <= time && runner.maxTime >=time)
                .findFirst()
                .orElseGet(()->{
                    System.out.println("Nie zanalazłem poziomu biegacza dla czasu: " + time);
                    return null;
                });
            }
    }





//    Stwórz klasę enum Runner ze stałymi BEGINNER, INTERMEDIATE, ADVANCED. Enum powinien posiadać dwa parametry:
//   • minimalny czas przebiegnięcia maratonu w minutach
//• maksymalny czas przebiegnięcia maratonu w minutach
//    Dodatkowo enum Runner powinien zawierać metodę statyczną getFitnessLevel(),
//    która przyjmuje na wejściu dowolny czas przebiegnięcia maratonu,
//    a jako rezultat powinna zwracać konkretny obiekt Runner na podstawie przekazanego czasu.

