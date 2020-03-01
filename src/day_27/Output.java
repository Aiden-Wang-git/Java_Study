package day_27;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-03-01 10:48
 */
public class Output implements Runnable {
    private Resource resource;
    public Output(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true)
            synchronized (resource){
            if (!resource.flag) {
                try {
                    resource.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                System.out.println(resource.name + "  " + resource.sex);
                resource.flag = false;
                resource.notify();
        }
    }
}
