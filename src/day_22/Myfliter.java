package day_22;

import java.io.File;
import java.io.FileFilter;

/**
 * ClassName:Myfliter
 * Package:day_22
 * Description:
 *
 * @date:2019/12/18 20:16
 * @author:Wang Jun
 */
public class Myfliter implements FileFilter{
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".mp3");
    }
}
