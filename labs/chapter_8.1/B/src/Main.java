import by.bsu.abiturientArray.AbiturientArray;
import by.bsu.exception.*;
import by.bsu.find.AvgMark;
import by.bsu.find.BadMarks;
import by.bsu.find.MaxMark;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.IOException;

/**
 * Created by dom on 17.04.2015.
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);
    private static final String LOG_FILE_NAME = "B\\log\\log4j.xml"; // properties
    static {
        new DOMConfigurator().doConfigure(LOG_FILE_NAME, org.apache.log4j.LogManager.getLoggerRepository());
    }
    public static void main (String[] args){
        logger.info("application starts");
        try{
            //создаём абитурентов
            AbiturientArray array = new AbiturientArray("E://java_projects//practise//chapter_8.1//B/db.txt");

            System.out.println(array.toString());

            AbiturientArray bad = BadMarks.badMarks(array);
            System.out.println(bad.toString());

            int avgmark = 200;
            AbiturientArray avgAb = AvgMark.avgMark(array, avgmark);
            System.out.println(avgAb.toString());

            AbiturientArray maxAb = MaxMark.maxMark(array);
            System.out.println(maxAb.toString());

        } catch (SetAbiturientException e){
            logger.error(e);
            //throw new SetAbiturientException("Не удалось создать массив абитуриентов. Выход за пределы массива абитуриентов.");
        } catch (IdException e) {
            logger.error(e);
            //throw new IdException("Нельзя создать абитуриента. Неподходящий id (<0).", e);
        } catch (MarkException e) {
            //throw new MarkException("Нельзя создать абитуриента. Некорректная оценка (mark<0 или mark>100).");
        } catch (NameException e) {
            //throw new NameException("Нельзя создать абитуриента. Введено пустое имя/фамилия/отчество/адресс.");
        } catch (PhoneException e) {
            //throw new PhoneException(e);
        } catch (IOException e) {
            logger.error(e);
        } catch (AbiturientException e){
            logger.error(e);
        }
        logger.info("application ends");

    }
}
