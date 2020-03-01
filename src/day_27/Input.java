package day_27;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-03-01 10:45
 */
public class Input implements Runnable {
    private Resource resource;

    public Input(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            synchronized (resource) {
                if (resource.flag){
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    if (i % 2 == 0) {
                        resource.name = "张三";
                        resource.sex = "男";
                    } else {
                        resource.name = "lisi";
                        resource.sex = "nv";
                    }
                    resource.flag = true;
                    resource.notify();
            }
            ++i;
        }
    }
}
