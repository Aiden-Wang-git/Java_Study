package day_27;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-03-01 10:50
 */
public class Test {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Input input = new Input(resource);
        Output output = new Output(resource);
        Thread tin = new Thread(input);
        Thread tout = new Thread(output);
        tin.start();
        tout.start();
    }
}
