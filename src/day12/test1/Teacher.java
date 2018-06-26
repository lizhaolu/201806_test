package day12.test1;


import org.apache.log4j.Logger;

/**
 * Created by superzhaolu on 2018/6/12.
 */
public class Teacher{
    private static Logger logger=Logger.getLogger(Teacher.class);
    Computer computer=new Computer();
    public void speak(Computer computer){
        try {
            logger.info("尝试运行电脑");
            computer.run();
            logger.info("正常上课");
        } catch (BlackException e) {
            computer.rebot();
            logger.info("正常上课");
        } catch (SmokingException e) {
            try {
                logger.fatal("电脑冒烟，课没法上");
                throw new TeachFailedException("电脑冒烟了，可没法上了");
            } catch (TeachFailedException e1) {
                e1.printStackTrace();
            }
        }
    }
}
