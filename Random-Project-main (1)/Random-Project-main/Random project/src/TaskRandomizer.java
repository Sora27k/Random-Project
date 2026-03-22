import java.util.Random;

public class TaskRandomizer extends Data{


    public TaskRandomizer(int num, String[] things) {
        super(num, things);
    }

    public String randomming(String[] things){
        String result = "";
        Random random = new Random();
        int num = things.length;

        result = things[random.nextInt(num)];
        return result;
    }
}